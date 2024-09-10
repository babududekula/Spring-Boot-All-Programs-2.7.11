package com.pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pack.service.ServiceClass;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception 
	{
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ServiceClass bean = context.getBean(ServiceClass.class);
//		bean.saveData();
		
		bean.getData();
		
	}

}
