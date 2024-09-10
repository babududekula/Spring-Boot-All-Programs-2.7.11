package com.pack1;

public class DebitCardPaymet implements Ipayment 
{

	@Override
	public String paymentMethod(double amount) 
	{
		return "Successfully Done The Payment Using Debit Card...";
	}

}
