FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
EXPOSE 9898
ARG JAR_FILE=target/spring-boot-docker.jar
ADD ${JAR_FILE} app.jardocker
ENTRYPOINT ["java", "-jar", "/app.jar"]