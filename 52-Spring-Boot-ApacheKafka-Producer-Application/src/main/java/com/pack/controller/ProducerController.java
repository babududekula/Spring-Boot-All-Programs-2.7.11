package com.pack.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.employee.Employee;
import com.pack.service.ProducerService;

@RestController
public class ProducerController 
{
	@Autowired
	private ProducerService service;
	
	@PostMapping("/add")
	public ResponseEntity<String> add(@RequestBody List<Employee> emp)
	{
		String string = service.addModuleService(emp);
		return new ResponseEntity<String>(string, HttpStatus.OK);
	}
}
