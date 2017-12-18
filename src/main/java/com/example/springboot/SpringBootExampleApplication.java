package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.example.springboot.configuration.JpaConfiguration;

@Import(JpaConfiguration.class)
@SpringBootApplication
public class SpringBootExampleApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}

}
