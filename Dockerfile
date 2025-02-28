FROM openjdk:8 as builder
ADD . /code/
RUN \
    apt-get update && \
    apt-get install build-essential -y && \
    cd /code/ && \
    rm -Rf target node_modules && \
    chmod +x /code/mvnw && \
    sleep 1 && \
    ./mvnw package -Pprod -DskipTests && \
    mv /code/target/*.war / && \
    apt-get clean && \
    rm -Rf /code/ /root/.m2 /root/.cache /tmp/* /var/lib/apt/lists/* /var/tmp/*  && \
    mkdir /tmp/jhispter && mkdir /tmp/jhispter/applications

FROM openjdk:8-jre-alpine
ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
    JHIPSTER_SLEEP=0 \
    JAVA_OPTS=""
RUN apk update && \
    apk add nodejs npm && \
    npm install -g generator-jhipster@6.3.1
CMD echo "The application will start in ${JHIPSTER_SLEEP}s..." && \
    sleep ${JHIPSTER_SLEEP} && \
    java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /jhonline*.war
EXPOSE 8080
COPY --from=builder /*.war .
