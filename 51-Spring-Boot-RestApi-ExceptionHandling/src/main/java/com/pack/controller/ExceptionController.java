package com.pack.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pack.customeException.NoNameFoundException;

@RestController
public class ExceptionController 
{
	@GetMapping("/customer/{name}")
	public ResponseEntity<String> name(@PathVariable String name)
	{
		String message = "";
		if(name.equals("Babu"))
		{
			message = name +" Dudekula";
		}
		else
		{
			throw new NoNameFoundException("No Name Found Exception");
		}
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
}
