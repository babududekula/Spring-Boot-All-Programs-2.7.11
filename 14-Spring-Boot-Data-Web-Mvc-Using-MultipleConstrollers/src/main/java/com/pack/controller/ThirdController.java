package com.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThirdController 
{
	@GetMapping("/evening")
	public ModelAndView evening()
	{
		ModelAndView mav = new ModelAndView("goodevening","name", "Good Evening Babu It's Time To Do Jogging...");
		return mav;
	}
}
