package com.pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.feignclient.FeignConfig;

@RestController
public class MyController 
{
	@Autowired
	private FeignConfig config;
	
	@GetMapping("/hello")
	public String msg()
	{
		String msg = "WELCOME DUDEKULA BABU....!";
		String string = config.msg();
		return msg +" "+string;
	}
}
