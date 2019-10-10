/**
 * Copyright 2017-2019 the original author or authors from the JHipster Online project.
 *
 * This file is part of the JHipster Online project, see https://github.com/jhipster/jhipster-online
 * for more information.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.jhipster.online.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.apache.commons.exec.ExecuteWatchdog;
import org.apache.commons.exec.PumpStreamHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import io.github.jhipster.online.config.ApplicationProperties;
import io.github.jhipster.online.service.enums.CiCdTool;

@Service
public class JHipsterService {

    public final Logger log = LoggerFactory.getLogger(JHipsterService.class);

    private final LogsService logsService;

    private final Executor taskExecutor;

    private final String jhipsterCommand;

    private final Integer timeout;
    
    private String jHipsterVersion;

    public JHipsterService(LogsService logsService, ApplicationProperties applicationProperties, Executor taskExecutor) throws ExecuteException, IOException {
        this.logsService = logsService;
        this.taskExecutor = taskExecutor;

        jhipsterCommand = applicationProperties.getJhipsterCmd().getCmd();
        timeout = applicationProperties.getJhipsterCmd().getTimeout();

        log.info("JHipster service will be using \"{}\" to run generator-jhipster.", jhipsterCommand);
        
        CommandLine cmdLine = CommandLine.parse(jhipsterCommand + " --version");
        DefaultExecutor executor = new DefaultExecutor();
        executor.setExitValues(new int[] {0,1});
        PipedInputStream snk=new PipedInputStream();
        PipedOutputStream stdout=new PipedOutputStream(snk);
        final BufferedReader input=new BufferedReader(new InputStreamReader(snk));
        
        PumpStreamHandler psh = new PumpStreamHandler(stdout);
        executor.setStreamHandler(psh);
        taskExecutor.execute(() -> {
            String line;
            try {
                while ((line = input.readLine()) != null) {
                    if(line.matches("[0-9]+\\.[0-9]+\\.[0-9]+")) {
                        jHipsterVersion=line;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        executor.execute(cmdLine);
    }
    
    public String getJHipsterVersion() {
        return jHipsterVersion;
    }

    public void installNpmDependencies(String generationId, File workingDir) throws IOException {
        this.logsService.addLog(generationId, "Installing the JHipster version used by the project");
        this.runProcess(generationId, workingDir, "npm install --ignore-scripts --package-lock-only");
    }

    public void generateApplication(String generationId, File workingDir) throws IOException {
        this.logsService.addLog(generationId, "Running JHipster");
        this.runProcess(generationId, workingDir, jhipsterCommand + " --force-insight --skip-checks " +
            "--skip-install --skip-cache --skip-git");
    }

    public void runImportJdl(String generationId, File workingDir, String jdlFileName) throws IOException {
        this.logsService.addLog(generationId, "Running `jhipster import-jdl");
        this.runProcess(generationId, workingDir, jhipsterCommand + " import-jdl " +
            jdlFileName + ".jh " +
            "--force-insight --skip-checks --skip-install --force ");
    }

    public void addCiCd(String generationId, File workingDir, CiCdTool ciCdTool) throws Exception {
        if (ciCdTool == null) {
            this.logsService.addLog(generationId, "Continuous Integration system not supported, aborting");
            throw new Exception("Invalid Continuous Integration system");
        }
        this.logsService.addLog(generationId, "Running `jhipster ci-cd`");
        this.runProcess(generationId, workingDir, jhipsterCommand + " ci-cd " +
            "--autoconfigure-" + ciCdTool.command() + " --force-insight --skip-checks --skip-install --force ");
    }

    private void runProcess(String generationId, File workingDir, String command) throws IOException {
        log.info("Running command: \"{}\" in directory:  \"{}\"", command, workingDir);
        try(final PrintStream ps=new PrintStream(new File(workingDir, "jhipster.log"))){
            CommandLine cmdLine = CommandLine.parse(command);
            DefaultExecutor executor = new DefaultExecutor();
            executor.setExitValues(new int[] {0,1});
            ExecuteWatchdog watchdog = new ExecuteWatchdog(TimeUnit.SECONDS.toMillis(timeout));
            executor.setWatchdog(watchdog);
            PipedInputStream snk=new PipedInputStream();
            PipedOutputStream stdout=new PipedOutputStream(snk);
            final BufferedReader input=new BufferedReader(new InputStreamReader(snk));
            
            PumpStreamHandler psh = new PumpStreamHandler(stdout);
            executor.setStreamHandler(psh);
            taskExecutor.execute(() -> {
                String line;
                try {
                    while ((line = input.readLine()) != null) {
                        ps.println(line);
                        log.debug(line);
                        this.logsService.addLog(generationId, line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            executor.setWorkingDirectory(workingDir);
            int exitValue = executor.execute(cmdLine);
            if(exitValue!=0) {
                log.error("\"{}\" has returned \"{}\"", cmdLine.getExecutable(), exitValue);
            }
        } catch (Exception e) {
            log.error("Error while running the process", e);
            throw e;
        }
    }
}
