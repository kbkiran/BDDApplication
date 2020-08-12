package com.deloitte.BDDApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.deloitte")
public class BddApplication {

	public static void main(String[] args) {
		SpringApplication.run(BddApplication.class, args);
	}

}
