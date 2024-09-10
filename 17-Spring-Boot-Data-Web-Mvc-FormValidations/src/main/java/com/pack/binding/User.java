package com.pack.binding;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.Data;

@Data
public class User 
{
	@NotEmpty(message = "uname is required")
	@Size(min = 3 , max = 10 , message = "name Should be limit")
	private String uname;
	@NotEmpty(message = "Password is madatory")
	@Size(min=6 , max = 10 , message = "Password Should 6 and 10")
	private String upwd;
	@NotEmpty(message = "Email is madatory")
	@Email
	private String email;
	@NotEmpty(message = "Mobile number required")
	@Pattern(regexp = "91-[0-9]{10}")
	@Size(min = 10 , message = "Phone Number should have 10 digits")
	private String mobile;
	@NotNull(message = "age is required")
	@Range(min = 18 , max = 45)
	private Integer age;
	
}
