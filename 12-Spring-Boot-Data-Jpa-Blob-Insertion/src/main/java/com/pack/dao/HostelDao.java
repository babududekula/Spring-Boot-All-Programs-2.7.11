package com.pack.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.entity.Hostel;

public interface HostelDao extends JpaRepository<Hostel, Serializable>
{
	
}
