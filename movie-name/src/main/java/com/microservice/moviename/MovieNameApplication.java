package com.microservice.moviename;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieNameApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieNameApplication.class, args);
	}

}
