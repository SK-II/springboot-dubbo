package com.ysl.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations="classpath:font-consumer-dubbo.xml")
@SpringBootApplication
public class CustomerAPP {
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerAPP.class, args);
	}
	
	
}
