package com.pack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController 
{
	@GetMapping("/welcome")
	public String msg()
	{
		String msg = "Welcome To MicroServices...";
		return msg;
	}
}
