package com.pack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController 
{
	@GetMapping("/hi")
	public String hi()
	{
		return "Hii.....";
	}
	@GetMapping("/hello")
	public String hello()
	{
		return "Hello....";
	}
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome....";
	}
	@GetMapping("/balance")
	public String balance()
	{
		String str = "Your Current Balance is : 8907.90";
		return str;
	}
	@GetMapping("/contact")
	public String contact()
	{
		String str = "Thanks For Conatcting Us";
		return str;
	}
	@GetMapping("/myloan")
	public String myLoan()
	{
		String str = "Your Current Loan is 698070.98";
		return str;
	}
}
