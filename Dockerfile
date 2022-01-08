FROM openjdk:14

WORKDIR /app

ADD /target/aula-jpa-spring*.jar aula-jpa.jar

EXPOSE 8080
EXPOSE 5005

ENTRYPOINT ["java", "-jar", "aula-jpa.jar"]
