package com.Jpa.jpapart3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Jpapart3Application {

	public static void main(String[] args) {
		SpringApplication.run(Jpapart3Application.class, args);
	}

}
