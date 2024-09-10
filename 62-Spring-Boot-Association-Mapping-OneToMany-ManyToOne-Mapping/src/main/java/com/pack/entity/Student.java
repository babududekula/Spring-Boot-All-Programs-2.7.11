package com.pack.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "STUDENT_DTLS")
@Data
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String age;
	private String number;
	
	@OneToMany(mappedBy = "student" , cascade = CascadeType.ALL)
	private List<Address> address;
	
}
