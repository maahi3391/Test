package com.om;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Student2Application {

	public static void main(String[] args) {
		SpringApplication.run(Student2Application.class, args);
	}

}
