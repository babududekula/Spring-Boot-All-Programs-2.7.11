package com.pack.entity;

import java.util.Date;

import lombok.Data;

@Data
public class PassengerDetails 
{
	private String firstName;
	private String lastName;
	private Integer age;
	private String from;
	private String to;
	private Date doj;
	private Double price;
	private String berth;
	private String coach;
	
	
}
