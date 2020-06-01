package com.ad.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.ad.controller")
@EntityScan(basePackages = {"com.ad.model","com.example.model"})
@EnableJpaRepositories("com.ad.repository")
@SpringBootApplication
public class HyperJaxbSpringbootJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyperJaxbSpringbootJpaApplication.class, args);
	}

}
