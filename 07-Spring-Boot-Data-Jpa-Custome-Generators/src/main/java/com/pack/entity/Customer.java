package com.pack.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data 
@Table(name="customer")
public class Customer 
{
	@Id
	@Column(name = "customer_id")
	@GenericGenerator(name = "customer_id_name" , strategy = "com.pack.generator.CustomeGenerator")
	@GeneratedValue(generator = "customer_id_name")
	private String id;
	@Column(name = "customer_age")
	private Integer age;
	@Column(name = "cutomer_gender")
	private String gender;
	@Column(name = "customer_salary")
	private Double salary;
	@Column(name = "customer_date")
	@Temporal(TemporalType.DATE)
	private Date date;
}
