package com.pack.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController 
{
	@Value("${welcome.message}")
	private String msg;
	
	@Value("${welcome.hello}")
	private String msg1;
	
	@Value("${welcome.greet}")
	private String msg2;
	
	@GetMapping("/welcome")
	public String message()
	{
		return msg;
	}
	
	@GetMapping("/hello")
	public String hello()
	{
		return msg1;
	}
	
	@GetMapping("/greet")
	public String greet()
	{
		return msg2;
	}
}
