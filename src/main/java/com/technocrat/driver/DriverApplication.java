package com.technocrat.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.technocrat")
public class DriverApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DriverApplication.class, args);
	}

}
