FROM openjdk:14

ADD /target/aula-jpa-spring-0.0.1-SNAPSHOT.jar aula-jpa-spring-0.0.1-SNAPSHOT.jar

EXPOSE 8080
EXPOSE 5005

ENTRYPOINT ["java", "-jar", "aula-jpa-spring-0.0.1-SNAPSHOT.jar"]
