package com.pack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "player")
public class Player 
{
	@Id
	@Column(name = "player_Id")
	private Integer playerId;
	@Column(name = "player_Name")
	private String playerName;
	@Column(name = "player_Age")
	private Integer playerAge;
	private String location;
	
}
