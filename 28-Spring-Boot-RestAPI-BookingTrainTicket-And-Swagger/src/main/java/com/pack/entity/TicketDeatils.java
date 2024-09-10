package com.pack.entity;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class TicketDeatils 
{
	private Integer trainNumber;
	private String name;
	private String doj;
	private String price;
	private String status;
	private String berth;
}
