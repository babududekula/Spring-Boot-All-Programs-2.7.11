package com.pack.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.entity.Account;
import com.pack.user.User;

public interface AccountDao extends JpaRepository<User, Account> 
{
	
}
