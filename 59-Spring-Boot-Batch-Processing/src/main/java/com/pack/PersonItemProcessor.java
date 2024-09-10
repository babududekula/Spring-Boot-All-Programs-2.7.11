package com.pack;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;


@Component
public class PersonItemProcessor implements ItemProcessor<Person, Person>
{

	@Override
	public Person process(Person item) throws Exception 
	{
		String firstName = item.getFirstName();
		String lastName = item.getLastName();
		Person person = new Person(firstName.toUpperCase(), lastName.toUpperCase());
		return person;
	}
	
}
