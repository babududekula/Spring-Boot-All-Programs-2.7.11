package com.pack.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MyController 
{
	private Logger logger = LoggerFactory.getLogger(MyController.class);
	
	@GetMapping("/welcome")
	public String message()
	{
		String message = "Welcome To Spring Boot";
		try 
		{
			int i = 10/0;
		} 
		catch (Exception e) 
		{
			logger.info("Error Has Occured...");
			throw new RuntimeException(message, e);
		}
		return message;
	}
}
