FROM maven:3.9.6-eclipse-temurin-21 AS build_image

WORKDIR /app
    
COPY pom.xml .
COPY src ./src
    
RUN mvn clean package
    
FROM redhat/ubi9-minimal
    
RUN microdnf install -y java-21-openjdk && microdnf clean all
    
WORKDIR /app
    
COPY --from=build_image /app/target/app.jar ./app.jar
    
CMD ["java", "-jar", "app.jar"]
    
    