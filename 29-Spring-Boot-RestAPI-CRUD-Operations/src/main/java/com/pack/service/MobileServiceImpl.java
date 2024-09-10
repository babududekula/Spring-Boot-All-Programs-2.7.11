package com.pack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pack.entity.Mobile;
import com.pack.repository.MobileRepository;


@Service
public class MobileServiceImpl implements MobileService 
{

	private MobileRepository repository;
	public MobileServiceImpl(MobileRepository repository) 
	{
		this.repository = repository;
	}
	
	@Override
	public String upset(Mobile mobile) 
	{
		String status ="";
		Integer mobileId = mobile.getMobileId();
		repository.save(mobile);
		if(mobileId == null)
		{
			status = "Mobile Data Inserted Successfully";
		}
		else
		{
			status=  "Mobile Data Updated Successfully";
		}
		return status;
	}

	@Override
	public List<Mobile> getAll() 
	{
		List<Mobile> findAll = repository.findAll();
		return findAll;
	}

	@Override
	public Mobile search(Integer mobileId) 
	{
		Mobile mobile ;
		Optional<Mobile> findById = repository.findById(mobileId);
		if(findById.isEmpty())
		{
			mobile = null;
		}
		else
		{
			mobile = findById.get();
		}
		return mobile;
	}

	@Override
	public String delete(Integer mobileId) 
	{
		repository.deleteById(mobileId);
		return "Mobile Deleted Successfully";
	}

}
