package com.pack.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.entity.Customer;

public interface CustomerDao extends JpaRepository<Customer, Serializable>
{

}
