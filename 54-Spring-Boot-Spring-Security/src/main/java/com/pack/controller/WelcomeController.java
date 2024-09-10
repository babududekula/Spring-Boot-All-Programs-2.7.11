package com.pack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController 
{
	@GetMapping("/welcome/{str}")
	public String message(@PathVariable String str)
	{
		String message = "Welcome To Spring Boot Security";
		return message + " Mr."+str;
	}
}
