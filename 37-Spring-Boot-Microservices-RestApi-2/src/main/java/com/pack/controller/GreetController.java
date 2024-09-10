package com.pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.binding.FiegnClientConfig;

@RestController
public class GreetController 
{
	@Autowired
	private FiegnClientConfig config;
	
	@GetMapping("/greet")
	public String greet()
	{
		String str = "Welcome Babu For This Spring Boot And MicroServices....!!";
		String message = config.message();
		
		return message + " "+", "+str;
	}
}
