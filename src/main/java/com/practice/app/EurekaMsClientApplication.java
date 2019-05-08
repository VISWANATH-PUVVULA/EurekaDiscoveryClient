package com.practice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient  // not mandatory to write. Spring Boot adds this for us
@SpringBootApplication
public class EurekaMsClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMsClientApplication.class, args);
	}

}
