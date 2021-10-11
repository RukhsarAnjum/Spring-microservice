package com.eurekaserver.eurekaserverex2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableDiscoveryClient
public class Eurekaserverex2Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekaserverex2Application.class, args);
	}

}
