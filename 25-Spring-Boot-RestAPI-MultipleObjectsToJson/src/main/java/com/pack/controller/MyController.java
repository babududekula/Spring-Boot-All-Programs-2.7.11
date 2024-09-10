package com.pack.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.entity.Product;

@RestController
public class MyController 
{
	@GetMapping("/welcome")
	public ResponseEntity<List<Product>> getAll()
	{
		Product product = new Product(1 , "Mobile" , "200");
		Product product1 = new Product(2 , "Table" , "300");
		Product product2 = new Product(3 , "AC" , "300");
		
		List<Product> list = Arrays.asList(product, product1 , product2);
		return new ResponseEntity<>(list, HttpStatus.OK);
		
	
	}
}
