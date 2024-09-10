package com.pack.bindin;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Data;

@Data
public class School 
{
	private Integer id;
	private String name;
	private String number;
	
}
