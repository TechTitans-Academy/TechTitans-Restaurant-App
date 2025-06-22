# Use a base image with JDK
FROM openjdk:17-jdk-slim

# Expose the application port
EXPOSE 8080

# Set the working directory
WORKDIR /app

# Copy the jar file to the container
COPY target/dinner-menu-0.0.1-SNAPSHOT.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
