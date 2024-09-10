package com.pack.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pack.bining.School;
import com.pack.dao.SchoolDao;

@Service
public class SchoolServiceImpl implements SchoolService {

	private SchoolDao repository;

	public SchoolServiceImpl(SchoolDao repository) {
		this.repository = repository;
	}

	@Override
	public String upset(School school) {
		String status = "";
		Integer id = school.getId();
		repository.save(school);
		if (id == null) {
			status = "Book Data Inserted Successfully";
		} else {
			status = "Book Data Updated Successfully";
		}
		return status;
	}

	@Override
	public List<School> getAll() {
		List<School> findAll = repository.findAll();
		return findAll;
	}
}
