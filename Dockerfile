FROM eclipse-temurin:20-jdk-alpine
VOLUME /tmp
COPY target/exam-scheduler-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8080
