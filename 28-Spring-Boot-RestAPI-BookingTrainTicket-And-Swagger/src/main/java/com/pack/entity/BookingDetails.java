package com.pack.entity;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class BookingDetails 
{
	private String firstName;
	private String lastName;
	private String doj;
	private String berth;
	private String coach;
	private String price;
	private String status;
	
	
}
