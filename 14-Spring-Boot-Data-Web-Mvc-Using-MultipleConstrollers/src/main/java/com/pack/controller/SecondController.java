package com.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController 
{
	@GetMapping("/afternoon")
	public ModelAndView noon()
	{
		ModelAndView mav = new ModelAndView("goodafternoon", "name", "Good AfterNoon Babu It's Time To Study...");
		return mav;
	}
}
