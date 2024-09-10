package com.pack.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController 
{
	@GetMapping("/welcome")
	public ResponseEntity<String> sayWelcome()
	{
		String message = "Welcome To Spring RestFul Services";
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
	@GetMapping("/greet")
	public String greet()
	{
		String name= "Welcome To Spring Boot And Microservices";
		return name;
	}
}
