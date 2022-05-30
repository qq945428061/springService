package com.example.eduspringservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class EduSpringServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduSpringServiceApplication.class, args);
	}

}
