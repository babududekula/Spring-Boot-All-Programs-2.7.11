package com.pack.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee 
{
	private Integer id;
	private String name;
	private Integer age;
	private String addr;
}
