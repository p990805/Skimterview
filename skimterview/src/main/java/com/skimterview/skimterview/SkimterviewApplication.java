package com.skimterview.skimterview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SkimterviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkimterviewApplication.class, args);
	}

}
