package com.pack.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController 
{
	private Logger logger = LoggerFactory.getLogger(WelcomeController.class);
	
	@GetMapping("/hello")
	public String msg()
	{
		String str = "Welcome To Spring Boot And MicroServices";
		try 
		{
			String string = null;
			if(string.equals("Babu"))
			{
				System.out.println("Good");
			}
		} 
		catch (Exception e) 
		{
			logger.info("Error is there");
			throw new RuntimeException(str, e);
		}
		return str;
	}
}
