package com.ecorp.credit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.ecorp"})
public class EcorpCreditCardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcorpCreditCardsApplication.class, args);
	}
}
