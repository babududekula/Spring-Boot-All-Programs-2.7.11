package com.pack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "HOSTEL_TABLE")
@Data

public class Hostel 
{
	@Id
	@Column(name = "HOSTEL_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "HOSTEL_NAME")
	private String name;
	@Column(name = "HOSTEL_RENT")
	private String rent;
	@Column(name = "HOSTEL_IMAGE")
	@Lob
	private byte[] image;
}
