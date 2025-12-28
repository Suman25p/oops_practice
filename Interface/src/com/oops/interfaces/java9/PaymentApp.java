package com.oops.interfaces.java9;

class UPIPayment implements IPaymentGateway
{
	@Override
	public void pay(double amount)
	{
		System.out.println("Processing UPI Payment of Rs. " + amount);
	}
}

class CreditCardPayment implements IPaymentGateway
{
	@Override
	public void pay(double amount)
	{
		System.out.println("Processing Credit Card Payment of Rs. " + amount);
	}
}

public class PaymentApp {

	public static void main(String[] args) 
	{
		IPaymentGateway upi = new UPIPayment();
		upi.processPayment(1500);
		
		System.out.println("--------------------------------");
		
		IPaymentGateway card = new CreditCardPayment();
		card.processPayment(7000);

	}

}
