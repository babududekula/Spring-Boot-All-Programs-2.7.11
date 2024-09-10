package com.pack.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.pack.binding.Person;

public class XMLToObject 
{
	public static void main(String[] args) throws Exception 
	{
		File file = new File("person.xml");
		
		JAXBContext context = JAXBContext.newInstance(Person.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Object object = unmarshaller.unmarshal(file);
		Person person = (Person)object;
		System.out.println(person);
	}
}
