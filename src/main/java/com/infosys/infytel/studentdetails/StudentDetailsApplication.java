package com.infosys.infytel.studentdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
//main class
public class StudentDetailsApplication {
	public static void main(String[] args) {
		SpringApplication.run(StudentDetailsApplication.class, args);
	}
}
