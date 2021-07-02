FROM openjdk:8-jdk-alpine
ADD build/libs/helloapp-0.0.1-SNAPSHOT.jar stakaterapp.jar
EXPOSE 80:8080
ENTRYPOINT ["java","-jar","stakaterapp.jar"]
