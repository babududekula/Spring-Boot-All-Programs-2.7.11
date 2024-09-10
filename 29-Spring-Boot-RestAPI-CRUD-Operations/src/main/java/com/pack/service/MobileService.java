package com.pack.service;

import java.util.List;

import com.pack.entity.Mobile;


public interface MobileService 
{
	public String upset(Mobile mobile);
	public List<Mobile> getAll();
	public Mobile search(Integer mobileId);
	public String delete(Integer mobileId);
}
