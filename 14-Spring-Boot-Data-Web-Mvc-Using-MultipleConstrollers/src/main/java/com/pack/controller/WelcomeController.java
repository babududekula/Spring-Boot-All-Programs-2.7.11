package com.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController 
{
	@GetMapping("/welcome")
	public ModelAndView welcome()
	{
		ModelAndView mav = new ModelAndView("welcome", "name","Welcome To Spring Boot");
		return mav;
	}
}
