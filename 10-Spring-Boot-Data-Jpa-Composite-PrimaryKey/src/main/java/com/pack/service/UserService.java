package com.pack.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.dao.AccountDao;
import com.pack.entity.Account;
import com.pack.user.User;

@Service
public class UserService 
{
	private AccountDao userRepo;
	
	public UserService(AccountDao userRepo) 
	{
		this.userRepo = userRepo;
	}
	
	public void setData()
	{
		Account account = new Account();
		account.setNumber(111);
		account.setName("HDFC");
		account.setType("Savings");
		
		User user = new User();
		user.setName("Babu");
		user.setMobile("9550458032");
		user.setMail("babu@gmail.com");
		user.setAccount(account);
		
		userRepo.save(user);
		
	}
	
	public void getData()
	{
		Account acc = new Account();
		acc.setNumber(111);
		acc.setName("HDFC");
		acc.setType("Savings");
		
		Optional<User> findById = userRepo.findById(acc);
		if(findById.isPresent())
		{
			System.out.println(findById.get());
		}
	}
}
