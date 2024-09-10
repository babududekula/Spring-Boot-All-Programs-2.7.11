package com.pack.binding;

import java.io.Serializable;

public class User implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer uid;
	public Integer getUid() 
	{
		return uid;
	}
	public void setUid(Integer uid) 
	{
		this.uid = uid;
	}
	public String getUname() 
	{
		return uname;
	}
	public void setUname(String uname) 
	{
		this.uname = uname;
	}
	public String getUcourse() 
	{
		return ucourse;
	}
	public void setUcourse(String ucourse) 
	
	{
		this.ucourse = ucourse;
	}
	private String uname;
	private String ucourse;
}
