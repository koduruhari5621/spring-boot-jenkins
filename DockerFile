

FROM java:8-jre
MAINTAINER Koduru Hari Krishna "koduruhari5621@gmail.com"

RUN mkdir /src

WORKDIR /src

COPY target/demo-service-0.0.1-SNAPSHOT.jar /src/demo-service-0.0.1-SNAPSHOT.jar

RUN sh -c 'touch /src/demo-service-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","/src/demo-service-0.0.1-SNAPSHOT.jar"]
