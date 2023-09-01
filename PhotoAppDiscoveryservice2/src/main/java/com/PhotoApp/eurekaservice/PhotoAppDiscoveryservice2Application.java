package com.PhotoApp.eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PhotoAppDiscoveryservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppDiscoveryservice2Application.class, args);
	}

}
