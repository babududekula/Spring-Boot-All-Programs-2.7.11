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

import com.pack.entity.Mobile;
import com.pack.service.MobileService;


@RestController
public class MobileController 
{
	@Autowired
	private MobileService mobileService;
	
	@PostMapping("/add")
	public ResponseEntity<String> addModule(@RequestBody Mobile mobile)
	{
		String upset = mobileService.upset(mobile);
		return new ResponseEntity<>(upset, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Mobile>> getAll()
	{
		List<Mobile> list = mobileService.getAll();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> UpdateModule(@RequestBody Mobile mobile)
	{
		String upset = mobileService.upset(mobile);
		return new ResponseEntity<>(upset, HttpStatus.OK);
	}
	
	@GetMapping("/search/{mobileId}")
	public ResponseEntity<Mobile> getMobile(@PathVariable Integer mobileId)
	{
		Mobile mobile = mobileService.search(mobileId);
		return new ResponseEntity<>(mobile, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{mobileId}")
	public ResponseEntity<String> deleteModule(@PathVariable Integer mobileId)
	{
		String delete = mobileService.delete(mobileId);
		return new ResponseEntity<>(delete, HttpStatus.OK);
	}
}
