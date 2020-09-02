package com.manish.sfg.msscbrewery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsscBreweryApplication {

	private static final Logger logger = LoggerFactory.getLogger(MsscBreweryApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MsscBreweryApplication.class, args);
	}

}
