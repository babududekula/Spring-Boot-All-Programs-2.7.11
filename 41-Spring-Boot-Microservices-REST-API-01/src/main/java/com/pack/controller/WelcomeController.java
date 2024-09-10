package com.pack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController 
{
	@GetMapping("/wish")
	public String message()
	{
		String message = "WELCOME TO SPRING BOOT AND MICROSERVICES....!";
		return message;
	}
}
