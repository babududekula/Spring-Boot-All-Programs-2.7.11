package com.pack2;

public class Bike 
{
	private BikeEngine1 eng;
	
	public Bike() 
	{
		System.out.println("Default Constructor ...");
	}
	public void setEng(BikeEngine1 eng) 
	{
		this.eng = eng;
	}
	public Bike(BikeEngine1 eng)
	{
		this.eng = eng;
	}
	public void driving()
	{
		int i = eng.starting();
		if(i <= 1)
		{
			System.out.println("Bike is Ready...");
		}
		else
		{
			System.out.println("Bike Has Not Ready To start");
		}
	}
}
