package com.pack.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pack.dao.ProductDao;
import com.pack.entity.Product;

@Controller
public class ProductController 
{
	@Autowired
	private ProductDao productDao;
	
	@GetMapping("/")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/addProduct")
	public String productReg()
	{
		return "registration";
	}
	
	@GetMapping("/added")
	public String add(@RequestParam Integer productId, @RequestParam String productName , 
			@RequestParam String customerMobile , @RequestParam Double productPrice , @RequestParam Integer productQuantity,
			 Product product , Model model)
	{
	
		Double mytotal = product.getProductPrice() * product.getProductQuantity();
		
		product.setProductTotal(mytotal);
		
		Double mydiscount = 0.0;
		if(mytotal<2500.00)
		{
			mydiscount = 0.1 * mytotal;
			
		}
		else if(product.getProductTotal()>= 2500.00 && product.getProductTotal()<=5000.00)
		{
			mydiscount = 0.15 * mytotal;
		}
		else
		{
			mydiscount = 0.30 * mytotal;
		}
		product.setProductDiscount(mydiscount);
		Double gst = 500.00;
		product.setProductServiceCharges(gst);
		
		Double myNetAmount = product.getProductTotal()-product.getProductPrice()+product.getProductServiceCharges();
		product.setProductInvoiceAmount(myNetAmount);
		
		productDao.save(product);
		
		return "success";
	}
	
	@GetMapping("/viewProduct")
	public String viewProduct(Model model)
	{
		model.addAttribute("babu", productDao.findAll());
		return "viewAll";
	}
	
	@GetMapping("/edit/{productId}")
	public String productEdit(@PathVariable Integer productId , Model model)
	{
		Product product = productDao.findById(productId).get();
		model.addAttribute("command", product);
		return "editform";
	}
	@PostMapping("/editform")
	public String update(
			Model model , Product product)
	{
        Double mytotal = product.getProductPrice() * product.getProductQuantity();
		
		product.setProductTotal(mytotal);
		
		Double mydiscount = 0.0;
		if(mytotal<2500.00)
		{
			mydiscount = 0.1 * mytotal;
			
		}
		else if(product.getProductTotal()>= 2500.00 && product.getProductTotal()<=5000.00)
		{
			mydiscount = 0.15 * mytotal;
		}
		else
		{
			mydiscount = 0.30 * mytotal;
			
		}
		product.setProductDiscount(mydiscount);
		Double gst = 500.00;
		product.setProductServiceCharges(gst);
		
		Double myNetAmount = product.getProductTotal()-product.getProductPrice()+product.getProductServiceCharges();
		product.setProductInvoiceAmount(myNetAmount);
		
		productDao.save(product);
		return "redirect:/viewProduct";
	}
	
	@GetMapping("/delete/{productId}")
	public String delete(@PathVariable Integer productId , Model model)
	{
		productDao.deleteById(productId);
		return "redirect:/viewProduct";
	}
}
