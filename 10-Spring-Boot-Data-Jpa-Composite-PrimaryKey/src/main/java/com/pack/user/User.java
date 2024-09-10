package com.pack.user;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.pack.entity.Account;

import lombok.Data;

@Entity
@Data
@Table(name="User_Table")
public class User 
{
	@Column(name = "USER_NAME")
	private String name;
	@Column(name = "USER_MOBILE")
	private String mobile;
	@Column(name = "USER_MAIL")
	private String mail;
	
	@EmbeddedId	
	private Account account;
}
