package com.ashokit.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.service.UserService;
import com.ashokit.user.model.User;
import com.ashokit.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserRepository repository;
	
	@Override
	public User addUser(User user) 
	{
		return repository.save(user);
	}
}
