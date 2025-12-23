package com.oops.polymorphism;

public class PaymentProcessor {
	public void processPayment(Banking banking)
	{
		banking.doFundTransfer();
	}
}
