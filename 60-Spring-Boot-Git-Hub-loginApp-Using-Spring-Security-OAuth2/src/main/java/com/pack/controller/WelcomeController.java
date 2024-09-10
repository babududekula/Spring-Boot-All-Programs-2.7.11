package com.pack.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController 
{
	@GetMapping("/welcome")
	public String login(Principal principal)
	{
		return "Welcome "+principal.getName()+ " ,Successfully Login Completed";
	}
}
