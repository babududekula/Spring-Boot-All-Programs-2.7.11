package com.pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.service.WelcomeService;

@RestController
public class WelcomeController 
{
	@Autowired
	private WelcomeService service;
	
	@GetMapping("/welcome")
	public String message()
	{
		String str = "Hello Babu...!";
		String welcomeMsg = service.welcomeMsg();
		return str+" "+welcomeMsg;
	}
}
