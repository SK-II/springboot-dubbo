package com.ysl.service.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations="classpath:customer-provider-dubbo.xml")
@SpringBootApplication
public class ProviderAPP {
	
	public static void main(String[] args) {
		
		SpringApplication.run(ProviderAPP.class, args);
		
	}
	
}
