package com.pack.customeException;

public class NoNameFoundException extends RuntimeException
{
	private static final long serialVersionUID = 1L;
	public NoNameFoundException(String name) 
	{
		super(name);
	}

}
