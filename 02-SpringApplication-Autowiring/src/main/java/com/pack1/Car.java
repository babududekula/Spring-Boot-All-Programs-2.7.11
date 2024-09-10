package com.pack1;


public class Car 
{
	private DieselEngine dng;
	
	public Car()
	{
		System.out.println("Deafult Constructor...");
	}
	public void setDng(DieselEngine dng)
	{
		this.dng = dng;
	}
	
	public void drive()
	{
		int i = dng.start();
		if(i <= 1)
		{
			System.out.println("Car Started");
		}
		else
		{
			System.out.println("Car Has Not Started");
		}
	}
}
