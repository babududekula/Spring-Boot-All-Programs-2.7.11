package com.pack1;

public class CredidCardPayment implements Ipayment 
{

	@Override
	public String paymentMethod(double amount) 
	{
		return "Successfully Done the Payment Using Credit Card...";
	}

}
