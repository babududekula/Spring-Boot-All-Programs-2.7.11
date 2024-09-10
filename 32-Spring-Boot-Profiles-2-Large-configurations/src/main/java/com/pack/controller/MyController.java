package com.pack.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.binfing.Mobile;

@RestController
public class MyController 
{
	@Autowired
	private Mobile mobile;
	
	@GetMapping("/welcome")
	public String messg()
	{
		Map<String, String> messages = mobile.getMessages();
		String string = messages.get("welcome");
		return string;
	}
	
	@GetMapping("/hello")
	public String message()
	{
		Map<String, String> messages = mobile.getMessages();
		String string = messages.get("hello");
		return string;
	}
	
	@GetMapping("/greet")
	public String msg()
	{
		Map<String, String> messages = mobile.getMessages();
		String string = messages.get("greet");
		return string;
	}
}
