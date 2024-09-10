package com.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController 
{
	@GetMapping("/morning")
	public ModelAndView morning()
	{
		ModelAndView mav = new ModelAndView("goodmorning", "name", "Good Morining Babu it is Time To Wake up...");
		return mav;
	}
}
