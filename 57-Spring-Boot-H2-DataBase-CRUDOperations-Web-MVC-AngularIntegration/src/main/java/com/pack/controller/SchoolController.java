package com.pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.bining.School;
import com.pack.service.SchoolServiceImpl;

@RestController
@CrossOrigin
public class SchoolController 
{
	@Autowired
	private SchoolServiceImpl service;
	
	@PostMapping("/add")
	public ResponseEntity<String> addModule(@RequestBody School school)
	{
		String upset = service.upset(school);
		return new ResponseEntity<>(upset, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<School>> getAllModule()
	{
		List<School> all = service.getAll();
		return new ResponseEntity<>(all, HttpStatus.OK);
	}
}
