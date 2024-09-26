package org.fullstack.foodie.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@SpringBootApplication(scanBasePackages = "org.fullstack.foodie")
@EnableTransactionManagement
@EntityScan(basePackages = "org.fullstack.foodie.model")
public class RunApplication {
	    public static void main(String[] args) {
	        SpringApplication.run(RunApplication.class, args);
	    }
	}


