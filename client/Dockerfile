FROM openjdk:21-jdk-alpine

# Add a volume pointing to /tmp to allow Spring Boot to write logs
VOLUME /tmp

# Copy the JAR file into the container (ensure the jar file name matches)
COPY target/question-service-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the application will run on
EXPOSE 8081

# Run the JAR file when the container starts
ENTRYPOINT ["java", "-jar", "/app.jar"]
