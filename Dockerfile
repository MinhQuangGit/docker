FROM openjdk:17
RUN ./mvnw install -DskipTests
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)
VOLUME /tmp
EXPOSE 9898
ARG JAR_FILE=target/spring-boot-docker.jar
ADD ${JAR_FILE} app.jardocker
ENTRYPOINT ["java", "-jar", "/app.jar"]