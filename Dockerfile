FROM amazoncorretto:21-alpine-jdk
MAINTAINER BRISH
COPY target/WABA-0.0.1-SNAPSHOT.jar Waba.jar
ENTRYPOINT ["java", "-jar", "/Waba.jar"]