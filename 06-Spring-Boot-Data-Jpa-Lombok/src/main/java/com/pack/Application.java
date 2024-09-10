package com.pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pack.dao.PlayerRepository;


@SpringBootApplication
public class Application 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		PlayerRepository repository = context.getBean(PlayerRepository.class);
		
		
	
	}

}
