package com.pack.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.entity.PassengerDetails;
import com.pack.entity.TicketDeatils;

@RestController
public class MyController 
{
	@PostMapping(value = "/register" , produces = {"application/json"} , consumes = {"application/xml" , "application/json"})
	public ResponseEntity<TicketDeatils> bookTicket(@RequestBody PassengerDetails pdetails)
	{
		TicketDeatils tdettails = new TicketDeatils();
		tdettails.setFirstName(pdetails.getFirstName());
		tdettails.setLastName(pdetails.getLastName());
		tdettails.setAge(pdetails.getAge());
		tdettails.setFrom(pdetails.getFrom());
		tdettails.setTo(pdetails.getTo());
		tdettails.setCoach(pdetails.getCoach());
		tdettails.setBerth(pdetails.getBerth());
		tdettails.setCost(pdetails.getPrice());
		tdettails.setStatus("Confirmed");
		
		System.out.println(tdettails);
		
		return new ResponseEntity<>(tdettails, HttpStatus.CREATED);
		
	}
}
