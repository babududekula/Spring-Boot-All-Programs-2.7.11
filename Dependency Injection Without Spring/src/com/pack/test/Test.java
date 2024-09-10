package com.pack.test;

import java.lang.reflect.Field;

import com.pack1.CredidCardPayment;
import com.pack1.DebitCardPaymet;
import com.pack1.PhonePe;
import com.pack2.BillPayment;

public class Test 
{
	public static void main(String[] args) throws Exception
	{
		BillPayment bp = new BillPayment();
		bp.setPayment(new CredidCardPayment());
		bp.billPayment(1500.00);
		System.out.println("=====================================");
		
		
		BillPayment bp1 = new BillPayment(new DebitCardPaymet());
		bp1.billPayment(1400.00);
		System.out.println("=====================================");
		
		
		Class<?> cls = Class.forName("com.pack2.BillPayment");
		Field field = cls.getDeclaredField("payment");
		field.setAccessible(true);
		Object obj = cls.newInstance();
		field.set(obj, new PhonePe());
		
		BillPayment bp2 = (BillPayment) obj;
		bp2.billPayment(1300.00);
		System.out.println("=====================================");
		
		
		PhonePe p = new PhonePe();
		BillPayment bp3 = new BillPayment();
		bp3.payment = p;
		bp3.billPayment(1200.00);
		
		
	}

}
