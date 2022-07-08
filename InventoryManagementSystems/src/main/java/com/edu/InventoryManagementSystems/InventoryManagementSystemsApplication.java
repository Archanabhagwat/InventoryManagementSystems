package com.edu.InventoryManagementSystems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.edu.InventoryManagementSystems")
public class InventoryManagementSystemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryManagementSystemsApplication.class, args);
	}

}
