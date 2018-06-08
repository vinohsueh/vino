package com.vino.shop.vino.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class VinoEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VinoEurekaApplication.class, args);
	}
}
