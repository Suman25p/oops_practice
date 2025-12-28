package com.oops.abstraction;

public class PaymentProcessor 
{
	public void process(PaymentMethod payment)
	{
		payment.validate();
		payment.pay();
	}
}
