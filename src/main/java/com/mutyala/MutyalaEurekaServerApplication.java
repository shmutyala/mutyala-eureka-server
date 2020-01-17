package com.mutyala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MutyalaEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MutyalaEurekaServerApplication.class, args);
	}

}
