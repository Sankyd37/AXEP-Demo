package com.amex.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value="com.amex")
public class SpringbootDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoProjectApplication.class, args);
	}
}
