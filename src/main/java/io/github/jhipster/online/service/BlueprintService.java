package io.github.jhipster.online.service;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.github.zafarkhaja.semver.Version;
import com.github.zafarkhaja.semver.expr.LexerException;

import io.github.jhipster.online.service.dto.npms.SearchResults;
import io.github.jhipster.online.service.dto.npms.details.DetailResult;

@Service
public class BlueprintService {
    private final ResponseEntity<SearchResults> searchResults;
    private List<DetailResult> collect;
    

    public BlueprintService(RestTemplate restTemplate, JHipsterService jHipsterService) {
        searchResults=restTemplate.getForEntity("https://api.npms.io/v2/search?q=keywords:jhipster-module+jhipster-5&from=0&size=50", SearchResults.class);
        collect=searchResults.getBody().getResults().stream().map(module -> {
            try {
                return restTemplate.getForEntity("https://api.npms.io/v2/package/"+StringUtils.substringAfterLast(module.getPackage().getLinks().getNpm(), "/"), DetailResult.class).getBody();
            } catch(Exception e) {
                return null;
            }
        }).filter(it -> {
            if(it==null)
                return false;
            String jHipster=it.getCollected().getMetadata().getDependencies().get("generator-jhipster");
            if(jHipster==null)
                return false;

            try {
                return Version.valueOf(jHipsterService.getJHipsterVersion()).satisfies(jHipster);
            } catch(LexerException e) {
                e.printStackTrace();
                return false;
            }
        }).collect(toList());
    }

    public List<DetailResult> getCollect() {
        return collect;
    }
}
