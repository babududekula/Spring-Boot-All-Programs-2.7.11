package com.pack2;

import com.pack1.Ipayment;

public class BillPayment 
{
	public Ipayment payment;
	
	public void setPayment(Ipayment payment)
	{
		this.payment=payment;
	}
	
	public BillPayment() 
	{
		
	}
	
	public BillPayment(Ipayment payment)
	{
		this.payment = payment;
	}
	
	public void billPayment(double amount)
	{
		String status = payment.paymentMethod(amount);
		System.out.println(status);
	}
}
