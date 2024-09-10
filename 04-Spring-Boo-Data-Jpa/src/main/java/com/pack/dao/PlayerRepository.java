package com.pack.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pack.entity.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer> 
{
	public List<Player> findByPlayerAgeAndLocation(Integer age , String name);
	
	public List<Player> findByPlayerAgeAndPlayerName(Integer playerId , String name);
	
	public List<Player> findByPlayerAgeGreaterThanEqual(Integer playerAge);
}
