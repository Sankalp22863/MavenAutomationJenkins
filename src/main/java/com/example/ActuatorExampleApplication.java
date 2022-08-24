package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// Configuration. 
// Component Scan. This tells what is the base package. (com.example)
// Auto Enable Configuration. 

// This does a overall configuration of the application.
public class ActuatorExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorExampleApplication.class, args);
	}

}
