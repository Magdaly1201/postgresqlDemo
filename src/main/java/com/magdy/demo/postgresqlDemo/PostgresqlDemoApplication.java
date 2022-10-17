package com.magdy.demo.postgresqlDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.magdy.demo.postgresqlDemo")
@EnableJpaRepositories(basePackages = "com.magdy.demo.postgresqlDemo.clean_architecture.infrastructure")
@EntityScan("com.magdy.demo.postgresqlDemo.clean_architecture.infrastructure.repository")
public class PostgresqlDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgresqlDemoApplication.class, args);
	}

}
