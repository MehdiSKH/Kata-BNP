# Stage 1: Build the Spring Boot application
FROM maven:3.8.5-openjdk-17 AS build
# Set the working directory
WORKDIR /app
# Copy the Maven pom.xml and the source code
COPY pom.xml ./
COPY src ./src
# Build the app (JAR file)
RUN mvn clean install -DskipTests

# Stage 2: Run the Spring Boot application
FROM openjdk:17.0.2-slim
# Set the working directory
WORKDIR /app
# Copy the JAR file from the build stage
COPY --from=build /app/target/*.jar app.jar
# Expose the application port
EXPOSE 8080
# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]