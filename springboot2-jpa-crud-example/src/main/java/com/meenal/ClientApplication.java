package com.meenal;

//package name - com.meenal  - upper pakage name 
//other package name - com.meenal.controller  etc 
//now no need to mention each package name in componantScan annotation 

//http://localhost:8080//api/v1/employees


//check with package name 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ClientApplication   {	
	
	public static void main(String[] args) {		
		SpringApplication.run(ClientApplication.class, args);
	}	
} 
