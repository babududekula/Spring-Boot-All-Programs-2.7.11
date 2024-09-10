package com.pack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pack.bining.School;
import com.pack.dao.SchoolDao;

@Service
public class SchoolServiceImpl implements SchoolService 
{
	
	private SchoolDao repository;
	public SchoolServiceImpl(SchoolDao repository) 
	{
		this.repository = repository;
	}
	
	@Override
	public String upset(School school) 
	{
		String status="";
		Integer id = school.getId();
		repository.save(school);
		if(id == null)
		{
			status="School Data Inserted Successfully";
		}
		else
		{
			status="School Data Updated Successfully";
		}
		return status;
	}

	@Override
	public School search(Integer id) 
	{
		Optional<School> findById = repository.findById(id);
		School school2 = findById.get();
		return school2;
	}

	@Override
	public List<School> getAll() 
	{
		List<School> findAll = repository.findAll();
		return findAll;
	}

	@Override
	public String delete(Integer id) 
	{
		String status = "";
		boolean existsById = repository.existsById(id);
		if(existsById == true)
		{
			repository.deleteById(id);
			status="School Data Deleted Successfully";
		}
		else
		{
			status="School Data has Not Found To Delete";
		}
		
		return status;
	}
	
}
