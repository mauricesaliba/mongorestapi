package com.mongorestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.mongorestapi"})
public class MongoRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoRestApplication.class, args);
	}

}
