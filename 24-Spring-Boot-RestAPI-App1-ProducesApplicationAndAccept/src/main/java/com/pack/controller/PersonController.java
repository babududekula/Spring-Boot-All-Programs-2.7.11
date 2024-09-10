package com.pack.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pack.binding.Person;

@RestController
public class PersonController 
{
	@GetMapping(value = "/person/{pid}",
			produces = {"application/xml" , "application/json"}
			)
	public ResponseEntity<Person> getDetails(@PathVariable Integer pid)
	{
		Person person = new Person();
		person.setPid(pid);
		person.setPname("Babu");
		person.setPaddress("Hyd");
		person.setPsalary("67000");
		person.setPage(25);
		
		return new ResponseEntity<>(person,HttpStatus.OK);
		
		
	}
}
