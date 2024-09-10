package com.pack.service;

import java.util.List;

import com.pack.bining.School;

public interface SchoolService 
{
	public String upset(School school);
	public School search(Integer id);
	public List<School> getAll();
	public String delete(Integer id);
}
