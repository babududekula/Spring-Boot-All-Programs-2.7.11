package com.pack.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController 
{
	@Value("${greet}")
	private String message;
	
	@Value("${message}")
	private String message1;
	
	@GetMapping("/get1")
	public String message()
	{
		return message;
	}
	
	@GetMapping("/get2")
	public String message1()
	{
		return message1;
	}
}
