package com.pack.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloController 
{
	@GetMapping("/hello")
	public ResponseEntity<String> getHello(@RequestParam String name , @RequestParam String cname)
	{
		String message = "Welcome To "+cname+" Application Mr."+name;
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
	@GetMapping("/details/{age}/{name}/{experice}")
	public ResponseEntity<String> sayWelcome(@PathVariable Integer age ,@PathVariable String name ,@PathVariable Integer experice)
	{
		String str = "My Name is "+name+"  and I have "+experice+" of Expericence and My Age is "+age;
		return new ResponseEntity<>(str,HttpStatus.OK);
	}
}
