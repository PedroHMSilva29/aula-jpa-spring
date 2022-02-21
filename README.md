# Spring boot: JpaRepository with Docker

####  &nbsp; Pedro Henrique Moreira


## Requisits

 &nbsp;<b>Spring Boot w/ Spring JPA, Spring Web and Mysql Connector</b>: 2.2.4.RELEASE <br />
 &nbsp;<b>JDK</b>: 11 <br />
 &nbsp;<b>Maven</b>: 3.6.3 <br />
 &nbsp;<b>Docker Desktop</b>: latest <br />

## Commands

 &nbsp;mvn clean install <br />
 &nbsp;docker-compose up --build --force-recreate <br />
 &nbsp;curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/pessoa/search-email?email=meire@gmail.com

## Code Snippets

##### application.properties
```
spring.datasource.url=jdbc:mysql://${MYSQL_HOST_DB:localhost}:3306/aulajpa
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=${HIBERNATE_DDL:none}
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect

```

##### import.sql

```sql
INSERT INTO pessoa(nome,email) VALUES ('Maria','maria@gmail.com');
INSERT INTO pessoa(nome,email) VALUES ('Joao Silva','joao@gmail.com');
INSERT INTO pessoa(nome,email) VALUES ('Carlos Silva','carlos@gmail.com');
INSERT INTO pessoa(nome,email) VALUES ('Adriana','adriana@gmail.com');
INSERT INTO pessoa(nome,email) VALUES ('Karina','karina@gmail.com');
INSERT INTO pessoa(nome,email) VALUES ('Carlos Marques','carlos@gmail.com');
INSERT INTO pessoa(nome,email) VALUES ('Carlos Pereira','carlos@gmail.com');
INSERT INTO pessoa(nome,email) VALUES ('Ana Maria','ana@gmail.com');
INSERT INTO pessoa(nome,email) VALUES ('Beatriz','beatriz@gmail.com');
INSERT INTO pessoa(nome,email) VALUES ('Joana','joana@gmail.com');
INSERT INTO pessoa(nome,email) VALUES ('Tulio Augusto','tulio@gmail.com');
INSERT INTO pessoa(nome,email) VALUES ('Augusto','augusto@gmail.com');
INSERT INTO pessoa(nome,email) VALUES ('Marta','marta@gmail.com');
INSERT INTO pessoa(nome,email) VALUES ('Silvio','silvio@gmail.com');
INSERT INTO pessoa(nome,email) VALUES ('Washington','washington@gmail.com');
INSERT INTO pessoa(nome,email) VALUES ('Teresa','teresa@gmail.com');
INSERT INTO pessoa(nome,email) VALUES ('Luciano','luciano@gmail.com');
INSERT INTO pessoa(nome,email) VALUES ('Fabiana','fabiana@gmail.com');
INSERT INTO pessoa(nome,email) VALUES ('Fabio','fabio@gmail.com');
INSERT INTO pessoa(nome,email) VALUES ('Gisele','gisele@gmail.com');
INSERT INTO pessoa(nome,email) VALUES ('Larissa','larissa@gmail.com');
INSERT INTO pessoa(nome,email) VALUES ('Natanael','natanael@gmail.com');
INSERT INTO pessoa(nome,email) VALUES ('Meire','meire@gmail.com');
```

## References

 &nbsp; https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference <br />
 &nbsp; https://github.com/devsuperior/aula-jparepository <br />
 &nbsp; https://github.com/rodrigorahman/spring-boot-com-mysql <br />
 &nbsp; https://docs.docker.com/desktop/
