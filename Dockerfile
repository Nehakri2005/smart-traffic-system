FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy full project
COPY . .

# Build the project
RUN chmod +x mvnw && ./mvnw clean package -DskipTests

# Run the jar
CMD ["java", "-jar", "target/smarttrafficsystem-0.0.1-SNAPSHOT.jar"]