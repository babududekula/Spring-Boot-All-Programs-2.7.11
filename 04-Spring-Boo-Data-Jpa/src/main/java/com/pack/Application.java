package com.pack;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pack.dao.PlayerRepository;
import com.pack.entity.Player;

@SpringBootApplication
public class Application 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		PlayerRepository repository = context.getBean(PlayerRepository.class);
		
		
//		List<Player> locationNellore = repository.findByPlayerAgeAndLocation(26 , "Hyd");
//		locationNellore.forEach(name->{
//			System.out.println(name);
//		});
		
//		List<Player> findByPlayerAgePlayerName = repository.findByPlayerAgeAndPlayerName(25, "AAA");
//		findByPlayerAgePlayerName.forEach(name->{
//			System.out.println(name);
//		});
		
		List<Player> findByPlayerAgeGreaterThanEqual = repository.findByPlayerAgeGreaterThanEqual(25);
		findByPlayerAgeGreaterThanEqual.forEach(name->{
			System.out.println(name);
		});
	}

}
