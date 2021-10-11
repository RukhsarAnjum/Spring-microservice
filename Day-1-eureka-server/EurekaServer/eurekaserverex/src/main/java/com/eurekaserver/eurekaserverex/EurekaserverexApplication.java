package com.eurekaserver.eurekaserverex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaserverexApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverexApplication.class, args);
	}

}
