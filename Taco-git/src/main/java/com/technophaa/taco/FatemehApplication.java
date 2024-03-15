package com.technophaa.taco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication (exclude = {SecurityAutoConfiguration.class })
public class FatemehApplication  {

	public static void main(String[] args) {
		SpringApplication.run(FatemehApplication.class, args);
	}

}
