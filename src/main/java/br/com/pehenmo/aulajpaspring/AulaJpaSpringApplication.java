package br.com.pehenmo.aulajpaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "br.com.pehenmo.aulajpaspring")
@EntityScan(basePackages = "br.com.pehenmo.aulajpaspring.model")
public class AulaJpaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulaJpaSpringApplication.class, args);
	}

}
