package com.vino.shop.config.server.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VinoEurekaConfigServerClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(VinoEurekaConfigServerClientApplication.class, args);
	}
	
}
