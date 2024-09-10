package com.pack.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product 
{
	private Integer pid;
	private String pname;
	private String pprice;
}