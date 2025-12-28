package com.oops.interfaces.java9;

public interface IPaymentGateway 
{
	public abstract void pay(double amount);
	
	default void processPayment(double amount)
	{
		if(validate(amount))
		{
			logTransaction(amount);
			pay(amount);
		}else {
			System.out.println("Invalid payment amount");
		}
	}
	
	private static boolean validate(double amount)
	{
		return amount > 0;
	}
	
	private static void logTransaction(double amount)
	{
		System.out.println("Logging payment of Rs. " + amount);
	}
}
