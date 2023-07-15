package com.thymeleaf.project01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thymeleaf.project01.entity.Student;
import com.thymeleaf.project01.repository.StudentRepository;

@SpringBootApplication
public class Project01Application  {
	

	public static void main(String[] args) {
		
		SpringApplication.run(Project01Application.class, args);
		
		
		
	}
	


}
