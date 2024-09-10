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
@Table(name = "MOBILE_TABLE")
public class Mobile 
{
	@Id
	@Column(name = "MOBILE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "MOBILE_NAME")
	private String name;
	@Column(name = "MOBILE_COST")
	private String cost;
	
}
