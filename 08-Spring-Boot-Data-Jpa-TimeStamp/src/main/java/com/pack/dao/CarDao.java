package com.pack.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.entity.Car;

public interface CarDao extends JpaRepository<Car, Serializable> 
{

}
