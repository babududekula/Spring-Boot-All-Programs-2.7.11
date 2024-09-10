package com.pack.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.entity.Laptop;

public interface LaptopDao extends JpaRepository<Laptop, Serializable>
{

}
