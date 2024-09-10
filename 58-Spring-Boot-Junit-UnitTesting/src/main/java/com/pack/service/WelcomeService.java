package com.pack.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService 
{
	public String welcomeMsg()
	{
		String str = "Welcome To Spring Boot Unit Testing In Java";
		return str;
	}
}
