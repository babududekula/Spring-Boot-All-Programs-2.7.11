package com.pack.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.bining.School;

public interface SchoolDao extends JpaRepository<School, Integer>
{
	
}
