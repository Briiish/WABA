FROM amazoncorretto:21-alpine-jdk
MAINTAINER BRISH
COPY target/WABA-0.0.1-SNAPSHOT.jar WabaBackend.jar
ENTRYPOINT ["java", "-jar", "/WabaBackend.jar"]