package com.pack.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Account implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Column(name = "ACCOUNT_NUMBER")
	private Integer number;
	@Column(name = "ACCOUNT_NAME")
	private String name;
	@Column(name = "ACCOUNT_TYPE")
	private String type;
}
