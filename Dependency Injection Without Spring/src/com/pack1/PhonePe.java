package com.pack1;

public class PhonePe implements Ipayment 
{

	@Override
	public String paymentMethod(double amount) 
	{
		return "Successfully Done The Payment Using Phone Pe App...";
	}

}
