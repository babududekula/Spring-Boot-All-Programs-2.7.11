package com.pack2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pack1.Motor;

@Component
public class Engine 
{
	private Motor motor;
	
	@Autowired
	public void setMotor(Motor motor) 
	{
		this.motor = motor;
	}
	
	public void method1()
	{
		motor.method2();
		System.out.println("This is Method1 From Motor...");
	}
	@PostConstruct
	public void init()
	{
		System.out.println("Initi Method is Called");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Destroy Method is Called...");
	}
}
