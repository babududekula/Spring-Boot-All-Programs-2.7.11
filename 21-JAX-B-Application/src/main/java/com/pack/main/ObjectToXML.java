package com.pack.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.pack.binding.Company;
import com.pack.binding.Person;

public class ObjectToXML 
{
	public static void main(String[] args) throws Exception {
		
		Company company = new Company();
		company.setCompanyName("Infosys");
		company.setCompanyAddress("Hyd");
		company.setCompanyId(5110);
		
		Person person = new Person();
		person.setPersonId(1);
		person.setPersonName("Babu");
		person.setPersonAddress("Hyd");
		person.setCompanyDetails(company);
		
		JAXBContext context = JAXBContext.newInstance(Person.class);
		Marshaller createMarshaller = context.createMarshaller();
		createMarshaller.marshal(person, new File("person.xml"));
		System.out.println("Marshling Completed...");
	}
}
