package com.pack1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Motor implements InitializingBean , DisposableBean
{
	public Motor() 
	{
		System.out.println("Motor :: Constructor");
	}
	
	public void method2()
	{
		System.out.println("This is Method2 From Motor...");
	}

	@Override
	public void afterPropertiesSet() throws Exception 
	{
		System.out.println("AfterPropertiesSet Method Called");
	}

	@Override
	public void destroy() throws Exception 
	{
		System.out.println("Detsroy Method is Called");	
	}
}
