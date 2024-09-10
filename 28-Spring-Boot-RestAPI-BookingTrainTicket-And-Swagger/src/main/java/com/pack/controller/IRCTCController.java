package com.pack.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.entity.BookingDetails;
import com.pack.entity.TicketDeatils;

@RestController
public class IRCTCController 
{
	@PostMapping( value = "/ticketBooking" ,
			consumes = {"application/xml","application/json"},
			produces = {"application/xml","application/json"}
			)
	public ResponseEntity<TicketDeatils> getAllTicketInfo(@RequestBody BookingDetails bdetails)
	{
		TicketDeatils tdetails = new TicketDeatils();
		tdetails.setName(bdetails.getFirstName()+" "+bdetails.getLastName());
		tdetails.setDoj(bdetails.getDoj());
		tdetails.setTrainNumber(12734);
		tdetails.setBerth(bdetails.getBerth());
		tdetails.setPrice(bdetails.getPrice());
		tdetails.setStatus("CONFIRMED");
		
		return new ResponseEntity<>(tdetails, HttpStatus.CREATED);
	}
}
