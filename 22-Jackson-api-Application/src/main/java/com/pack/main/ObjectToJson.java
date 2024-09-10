package com.pack.main;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pack.binding.Customer;
import com.pack.binding.Person;

public class ObjectToJson 
{
	public static void main(String[] args) throws Exception 
	{
		Person person = new Person();
		person.setPid(111);
		person.setPname("Dudekula");
		person.setPaddress("Nellore");
		
		 Customer customer = new Customer();
		 customer.setId(1);
		 customer.setName("Babu");
		 customer.setAddress("Hyd");
		 customer.setPersonDetails(person);
		 
		 ObjectMapper mapper = new ObjectMapper();
		 mapper.writeValue(new File("customer.json"), customer);
		 System.out.println("conversion Completed...");
		
	}
}
