package com.viewnext.microWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroWebApplication.class, args);
	}

}
