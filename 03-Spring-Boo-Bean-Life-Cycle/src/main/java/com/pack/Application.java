package com.pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.pack2.Engine;

@SpringBootApplication
@ComponentScan(basePackages = {"com.pack" , "com.pack1" , "com.pack2"})
public class Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		Engine engine = context.getBean(Engine.class);
		engine.method1();
	}

}
