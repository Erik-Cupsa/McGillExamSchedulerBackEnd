FROM eclipse-temurin:21-jdk-alpine

VOLUME /tmp

# Copy application JAR and configuration file
COPY target/exam-scheduler-0.0.1-SNAPSHOT.jar /app.jar
COPY src/main/resources/application.properties /app/application.properties

# Set a default value for PORT environment variable in case it's not provided
ENV PORT=8080

# The following line dynamically sets the port at runtime based on the $PORT environment variable
CMD ["sh", "-c", "java -Dspring.config.location=/app/application.properties -Dserver.port=$PORT -jar /app.jar"]
