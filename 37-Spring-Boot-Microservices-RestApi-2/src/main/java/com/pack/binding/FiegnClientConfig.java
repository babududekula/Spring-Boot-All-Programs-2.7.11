package com.pack.binding;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "WELCOME-API")
public interface FiegnClientConfig 
{
	@GetMapping("/welcome")
	public String message();
}
