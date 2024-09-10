package com.pack.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.pack.dao.LaptopDao;
import com.pack.dao.MobileDao;
import com.pack.entity.Laptop;
import com.pack.entity.Mobile;

@Service
public class ServiceClass 
{
	private LaptopDao laptopRepo;
	
	private MobileDao mobileRepo;
	
	public ServiceClass(LaptopDao laptopRepo , MobileDao mobileRepo) 
	{
		this.laptopRepo=laptopRepo;
		this.mobileRepo=mobileRepo;
	}
	
	@Transactional(rollbackOn = Exception.class)
	public void method1()
	{
		Laptop lap = new Laptop();
		lap.setName("DELL");
		lap.setCost("55000");
		laptopRepo.save(lap);
		
		Object obj = null;
		obj.toString();
		
		Mobile mob = new Mobile();
		mob.setName("IPHONE");
		mob.setCost("77000");
		mobileRepo.save(mob);
	}
}
