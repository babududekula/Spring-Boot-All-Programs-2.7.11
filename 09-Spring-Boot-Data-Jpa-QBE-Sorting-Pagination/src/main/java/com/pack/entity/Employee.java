package com.pack.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
@Table(name = "emp_20")
public class Employee 
{
	@Id
	@Column(name = "emp_id")
	private Integer id;
	@Column(name = "emp_name")
	private String name;
	@Column(name = "emp_salary")
	private Double salary;
	@Column(name = "emp_location")
	private String location;
	@Temporal(TemporalType.DATE)
	@Column(name = "emp_date")
	private Date date;
}
