package com.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstConstroller 
{
	@GetMapping("/hello")
	public ModelAndView welcome()
	{
		ModelAndView mav = new ModelAndView("welcome", "message", "Welcome To Spring Boot");
		return mav;
	}
}
