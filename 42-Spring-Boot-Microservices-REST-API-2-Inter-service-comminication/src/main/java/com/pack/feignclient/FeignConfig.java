package com.pack.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "WELCOME-API")
public interface FeignConfig 
{
	@GetMapping("/wish")
	public String msg();
}
