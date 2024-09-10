package com.pack.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class SecuredService 
{
	private String apiUrl = "http://localhost:1111/welcome/Bhavani";
	public void invokeWelcomeApiRestTemplate()
	{
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setBasicAuth("Babu", "babu1523");
		
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		
		ResponseEntity<String> exchange = restTemplate.exchange(apiUrl, HttpMethod.GET,entity , String.class);
		
		String body = exchange.getBody();
		System.out.println(body);
	}
	
	public void inovokeWelcomeApiWebClient()
	{
		WebClient webClient = WebClient.create();
		String block = webClient.get()
				 .uri(apiUrl)
				 .headers(header -> header.setBasicAuth("Babu", "babu1523"))
				 .retrieve()
				 .bodyToMono(String.class)
				 .block();
		System.out.println(block);
	}
}
