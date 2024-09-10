package com.pack.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.binding.Book;

@RestController
public class BookController 
{
	@PostMapping(value = "/wel", 
			consumes = {"application/json","application/xml"}
			)
	public ResponseEntity<String> getBookDetails(@RequestBody Book book)
	{
		System.out.println(book);
		return new ResponseEntity<>("Successfully Added", HttpStatus.CREATED);
	}
	
}
