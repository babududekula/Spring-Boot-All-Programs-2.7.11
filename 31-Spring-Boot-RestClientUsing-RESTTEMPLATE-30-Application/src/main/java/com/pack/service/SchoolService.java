package com.pack.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pack.entity.School;

@Service
public class SchoolService 
{
	public void inovkeSchoolMethod()
	{
		String url = "http://localhost:2222/add";
		
		School sh = new School();
		sh.setName("ESS");
		sh.setNumber("1234");
		
		RestTemplate template = new RestTemplate();
//		ResponseEntity<String> postForEntity = template.postForEntity(url, sh, String.class);
//		System.out.println(postForEntity);
		ResponseEntity<String> postForEntity = template.postForEntity(url, sh, String.class);
		System.out.println(postForEntity);
	}
	
	public void getSchoolMethodData()
	{
		String url = "http://localhost:2222/getAll";
		RestTemplate template = new RestTemplate();
		ResponseEntity<String> forEntity = template.getForEntity(url, String.class);
		String string = forEntity.getBody();
		System.out.println(string);
	}
	
	public void getSchoolJsonToObject()
	{
		String url ="http://localhost:2222/getAll";
		RestTemplate template = new RestTemplate();
		ResponseEntity<School[]> forEntity = template.getForEntity(url, School[].class);
		School[] body = forEntity.getBody();
		for(School sh : body)
		{
			System.out.println(sh);
		}
	}
}
