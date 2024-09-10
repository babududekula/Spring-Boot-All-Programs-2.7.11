package com.pack.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.pack.bean.Product;

@Controller
public class ProductController 
{
	@GetMapping("/welcome")
	public String getProduct(Model model)
	{
		Product product = new Product();
		model.addAttribute("name", product);
		return "reg";
	}
	
	@PostMapping("/reg")
	public String product(Product product , Model model)
	{
		System.out.println(product);
		model.addAttribute("message", "Successfully Added Product");
		return "success";
	}
}
