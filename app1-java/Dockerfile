# Этап 1: Сборка JAR-файла с помощью Maven
FROM maven:3.9-eclipse-temurin-17 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Этап 2: Минимальный легковесный образ для запуска
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# Копируем собранный jar-файл из предыдущего этапа
COPY --from=builder /app/target/app1-java-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]