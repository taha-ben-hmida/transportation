package com.example.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.example.poc.controller","com.example.poc.application.mapper", "com.example.poc.application.serviceApplicatifs",  "com.example.poc.domain.model", "com.example.poc.domain.repository","com.example.poc.application.dto"
		,"com.example.poc.application.mapper", "com.example.poc.domain.serviceMetier","com.example.poc.config"})
public class PocSpringPostgresApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocSpringPostgresApplication.class, args);
	}

}
