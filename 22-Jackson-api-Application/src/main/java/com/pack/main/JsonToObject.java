package com.pack.main;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pack.binding.Customer;

public class JsonToObject 
{
	public static void main(String[] args)  throws Exception
	{
		File file = new File("customer.json");
		
		ObjectMapper mapper = new ObjectMapper();
		Customer customer = mapper.readValue(file, Customer.class);
		System.out.println(customer);
	}
}
