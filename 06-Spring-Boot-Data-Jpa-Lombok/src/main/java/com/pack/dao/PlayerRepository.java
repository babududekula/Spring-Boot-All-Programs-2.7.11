package com.pack.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.pack.entity.Player1;

public interface PlayerRepository extends CrudRepository<Player1, Serializable>
{
	
}
