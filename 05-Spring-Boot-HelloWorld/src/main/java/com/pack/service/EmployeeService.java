package com.pack.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeService 
{
	public EmployeeService() 
	{
		System.out.println("EmployeeService Constructor is Created...");
	}
	
	@Bean
	public EmployeeService empService()
	{
		EmployeeService emp = new EmployeeService();
		return emp;
	}
}
