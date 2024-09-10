package com.pack.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.entity.Product;

public interface ProductDao extends JpaRepository<Product, Serializable>
{

}
