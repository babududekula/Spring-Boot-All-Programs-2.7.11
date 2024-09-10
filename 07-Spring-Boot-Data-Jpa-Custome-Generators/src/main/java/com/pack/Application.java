package com.pack;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pack.dao.CustomerDao;
import com.pack.entity.Customer;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		CustomerDao bean = context.getBean(CustomerDao.class);
		
		Customer cust = new Customer();
		cust.setAge(25);
		cust.setGender("Male");
		cust.setSalary(5500.90);
		cust.setDate(new Date());
		
		Customer customer = bean.save(cust);
		System.out.println(customer);
		
		
	}

}
