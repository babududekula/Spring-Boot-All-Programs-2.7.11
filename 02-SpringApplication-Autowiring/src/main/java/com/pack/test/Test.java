package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack1.Car;
import com.pack2.Bike;

public class Test 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/xml/applicationContext.xml");
		
		Car car = context.getBean("car" ,Car.class);
		car.drive();
		
		System.out.println("===========================");
		
		Bike bike = context.getBean("bike" , Bike.class);
		bike.driving();
		
		
	}

}
