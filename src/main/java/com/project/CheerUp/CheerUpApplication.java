package com.project.CheerUp;

import org.neo4j.ogm.config.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableTransactionManagement
@EntityScan(basePackages = "com.project.CheerUp.models")
@EnableNeo4jRepositories("com.project.CheerUp.repositories")
public class CheerUpApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheerUpApplication.class, args);
	}
	

}
