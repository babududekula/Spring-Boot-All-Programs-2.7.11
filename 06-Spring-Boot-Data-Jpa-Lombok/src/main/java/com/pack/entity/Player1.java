package com.pack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "player1")
public class Player1 
{
	@Id
	@Column(name = "player_id")
	private Integer id;
	@Column(name = "player_name")
	private String name;
	@Column(name = "player_location")
	private String location;
}
