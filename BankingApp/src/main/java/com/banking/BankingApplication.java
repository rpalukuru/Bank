package com.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
public class BankingApplication {

	public static void main(String[] args) {
		System.out.println("Before");
		SpringApplication.run(BankingApplication.class, args);
		System.out.println("After");
	}

}
