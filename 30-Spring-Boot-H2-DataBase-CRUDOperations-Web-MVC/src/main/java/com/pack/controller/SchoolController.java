package com.pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.bining.School;
import com.pack.service.SchoolServiceImpl;

@RestController
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
	
	@PutMapping("/update")
	public ResponseEntity<String> updateModule(@RequestBody School school)
	{
		String upset = service.upset(school);
		return new ResponseEntity<>(upset, HttpStatus.OK);
	}
	
	@GetMapping("/search/{id}")
	public ResponseEntity<School> searchModule(@PathVariable Integer id)
	{
		School search = service.search(id);
		return new ResponseEntity<School>(search, HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<School>> getAllModule()
	{
		List<School> all = service.getAll();
		return new ResponseEntity<>(all, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteModule(@PathVariable Integer id)
	{
		String delete = service.delete(id);
		return new ResponseEntity<String>(delete, HttpStatus.OK);
	}
}
