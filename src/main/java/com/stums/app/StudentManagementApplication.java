package com.stums.app;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Spring Boot Application entry point to access financial email records from users email inbox.
@SpringBootApplication
public class StudentManagementApplication {

	private static final Logger LOGGER = LogManager.getLogger(StudentManagementApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
		LOGGER.info("Service initialized successfully");
	}

}
