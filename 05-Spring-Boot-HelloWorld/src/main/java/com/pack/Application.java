package com.pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.pack" , "pack.dao"})
public class Application 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class, args);
		System.out.println("Welcome To Spring Boot Program...");
	}
}
