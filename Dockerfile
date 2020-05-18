FROM openjdk:11.0.7-jdk-buster
EXPOSE 8080
WORKDIR /usr/local/bin/
COPY ./target/simple-dockerize-project-0.0.1-SNAPSHOT.jar webapp.jar
CMD ["java", "-Dspring.profiles.active=docker", "-jar", "webapp.jar"]

