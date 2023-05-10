
# Note: Use openjdk:16.0.1 for Maven compiler version 11

FROM openjdk:8 
COPY /target/rest-svc.jar /app/rest-svc.jar
CMD ["java", "-jar", "/app/rest-svc.jar"]
