package com.pack.controller;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.pack.binding.User;

@org.springframework.stereotype.Controller
public class Controller 
{
	@GetMapping("/")
	public String getForm(Model model)
	{
		User user = new User();
		model.addAttribute("user", user);
		return "home";
	}
	
	@PostMapping("/reg")
	public String form(@Valid User person ,BindingResult result , Model model)
	{
		if(result.hasErrors())
		{
			return "home";
		}
		System.out.println(person);
		model.addAttribute("msg", "SuccessFully Added User....");
		return "success";
		
	}
}
