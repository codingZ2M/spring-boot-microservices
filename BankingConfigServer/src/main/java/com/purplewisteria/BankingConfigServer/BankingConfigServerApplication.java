package com.purplewisteria.BankingConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BankingConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingConfigServerApplication.class, args);
	}

}