package com.pack.controller;

import java.util.List;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.binding.User;

@RestController
public class UserRestController 
{
	HashOperations<String, Integer, User> hashOperations;
	
	public UserRestController(RedisTemplate<String, User> redisTemplate) 
	{
		hashOperations = redisTemplate.opsForHash();
	}
	
	@PostMapping("/add")
	public String addData(@RequestBody User user)
	{
		String message = "";
		Integer uid = user.getUid();
		if(uid == null)
		{
			hashOperations.put("PERSONS", user.getUid(), user);
			message = "Insertion Success...";
		}	
		else
		{
			hashOperations.put("PERSONS", user.getUid(), user);
			message = "Updation Has Completed...";
		}
		return message;
	}
	
	@GetMapping("/get/{uid}")
	public User retrive(@PathVariable Integer uid)
	{
		User user = hashOperations.get("PERSONS", uid);
		return user;
	}
	
	@GetMapping("/getAll")
	public List<User> getAll()
	{
		List<User> values = hashOperations.values("PERSONS");
		return values;
	}
	
	@DeleteMapping("/delete/{uid}")
	public String delete(@PathVariable Integer uid)
	{
		hashOperations.delete("PERSONS", uid);
		return "Deleted SuccessFully...";
	}
}
