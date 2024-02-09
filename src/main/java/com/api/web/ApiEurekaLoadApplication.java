package com.api.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiEurekaLoadApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiEurekaLoadApplication.class, args);
	}

}
