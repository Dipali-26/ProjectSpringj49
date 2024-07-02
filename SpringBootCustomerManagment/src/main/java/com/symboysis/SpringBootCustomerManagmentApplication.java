package com.symboysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan({"com.symboysis","com.controller","com.dao","com.service","com.model"})
@EntityScan("com.model")
@EnableJpaRepositories(basePackages="com.dao")
@SpringBootApplication
public class SpringBootCustomerManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCustomerManagmentApplication.class, args);
	}

}
