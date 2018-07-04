package com.vino.shop.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VinoAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(VinoAuthApplication.class, args);
	}
}
