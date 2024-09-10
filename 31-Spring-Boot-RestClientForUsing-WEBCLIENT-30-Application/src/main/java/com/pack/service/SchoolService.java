package com.pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.pack.bindin.School;

@Service
public class SchoolService 
{
	
	@Autowired
	private WebClient.Builder webClient;
	
	public void invokePostMethod()
	{
		String url = "http://localhost:2222/add";
		School sh = new School();
		sh.setName("ESS");
		sh.setNumber("1234");
		
		WebClient client = WebClient.create();
		School block = client.post()
			  .uri(url)
			  .bodyValue(sh)
			  .retrieve()
			  .bodyToMono(School.class)
			  .block();
		System.out.println(block);
	}
	
	public void invokeGetMethod()
	{
		 School school = webClient.build()
			  .get()
			  .uri("http://localhost:2222/getAll")
			  .retrieve()
			  .bodyToMono(School.class)
			  .block();
		System.out.println(school);
	}
	
	public void invokeGetMethodForAll()
	{
		String url = "http://localhost:2222/getAll";
		
		WebClient client = WebClient.create();
		School[] block = client.get()
			  .uri(url)
			  .retrieve()
			  .bodyToMono(School[].class)
			  .block();
		for(School sc : block)
		{
			System.out.println(sc);
		}
	}
}
