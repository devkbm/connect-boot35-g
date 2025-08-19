package com.like;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import jakarta.annotation.PostConstruct;

@ConfigurationPropertiesScan
@SpringBootApplication
public class ConnectBoot35GApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectBoot35GApplication.class, args);
	}

	@PostConstruct
	void started() {
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
	}
}
