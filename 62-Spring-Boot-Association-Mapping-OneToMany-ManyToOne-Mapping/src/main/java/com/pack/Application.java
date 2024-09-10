package com.pack;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pack.addressRepository.AddressRepository;
import com.pack.entity.Address;
import com.pack.entity.Student;
import com.pack.studentRepository.StudentRepository;

@SpringBootApplication
public class Application 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		StudentRepository bean = context.getBean(StudentRepository.class);
		AddressRepository bean2 = context.getBean(AddressRepository.class);
		
		
		
		Student student = new Student();
		student.setName("Babu");
		student.setAge("25");
		student.setNumber("9550458032");
		
		
		
		Student student1 = new Student();
		student1.setName("Subhash");
		student1.setAge("22");
		student1.setNumber("6305359230");
		
		
		Address address = new Address();
		address.setStreet("Collegmitta");
		address.setCity("Venkatagiri");
		address.setState("Andhra Pradesh");
		address.setCountry("India");
		address.setStudent(student);
		
		Address address2 = new Address();
		address2.setStreet("Ammavaripeta");
		address2.setCity("Venkatagiri");
		address2.setState("Andhra Pradesh");
		address2.setCountry("India");
		address2.setStudent(student);
		
		Address address1 = new Address();
		address1.setStreet("Mandalillu");
		address1.setCity("Venkatagiri");
		address1.setState("Andhra Pradesh");
		address1.setCountry("India");
		address1.setStudent(student1);
		
		Address address3 = new Address();
		address3.setStreet("RaniPeta");
		address3.setCity("Venkatagiri");		
		address3.setState("Andhra Pradesh");
		address3.setCountry("India");
		address3.setStudent(student1);
		
	
		List<Address> asList = Arrays.asList(address , address2);
		List<Address> asList2 = Arrays.asList(address1 , address3);
		
		student.setAddress(asList);
		student1.setAddress(asList2);
		
		bean.saveAll(List.of(student,student1));
		
		
		bean.deleteById(1);
		System.out.println("Data Has Saved Successfully");
		
		
	}

}
