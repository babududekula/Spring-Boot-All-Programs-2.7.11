package com.pack.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.entity.Mobile;

public interface MobileDao extends JpaRepository<Mobile, Serializable>
{

}
