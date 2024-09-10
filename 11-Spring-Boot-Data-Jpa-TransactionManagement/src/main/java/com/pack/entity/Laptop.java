package com.pack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "LAPTOP_TABLE")
public class Laptop 
{
	@Id
	@Column(name = "LAPTOP_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "LAPTOP_NAME")
	private String name;
	@Column(name = "LAPTOP_COST")
	private String cost;
}
