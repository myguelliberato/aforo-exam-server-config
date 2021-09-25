package com.aforo255.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MsServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsServerConfigApplication.class, args);
	}

}
