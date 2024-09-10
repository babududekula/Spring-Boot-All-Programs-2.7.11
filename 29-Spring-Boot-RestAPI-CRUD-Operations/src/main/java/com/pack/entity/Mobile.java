package com.pack.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Table(name = "MOBILE_SPECIFICATION")
@Data
public class Mobile 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MOBILEID")
	private Integer mobileId;
	@Column(name = "MOBILENAME")
	private String mobileName;
	@Column(name = "MOBILERAM")
	private String mobileRam;
	@Column(name = "MOBILEROM")
	private String mobileRom;
	@Column(name = "MOBILEPRICE")
	private Double mobilePrice;
	@CreationTimestamp
	@Column(name = "MOBILEDATE" ,updatable = false)
	private LocalDateTime mobileDate;
}
