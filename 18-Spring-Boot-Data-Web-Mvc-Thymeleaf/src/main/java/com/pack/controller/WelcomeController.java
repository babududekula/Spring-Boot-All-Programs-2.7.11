package com.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pack.binding.Company;

@Controller
public class WelcomeController 
{
	@GetMapping("/welcome")
	public String getCompany(Model model)
	{
		Company company = new Company();
		model.addAttribute("company", company);
		return "welcome";
	}
	
	@GetMapping("/hello")
	public String company(Model model)
	{
		model.addAttribute("company", "Welcome To Spring Boot");
		return "welcome";
	}
}
