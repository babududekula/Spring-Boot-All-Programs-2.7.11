package com.pack.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "ADDRESS_DTLS")
@Data
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String street;
	private String city;
	private String state;
	private String country;
	
	@ManyToOne
	@JoinColumn(name = "student_Id")
	private Student student;
}
