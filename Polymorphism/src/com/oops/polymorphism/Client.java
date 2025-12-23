package com.oops.polymorphism;

public class Client {

	public static void main(String[] args) {
		
		PaymentProcessor paymentProcessor = new PaymentProcessor();
		
		CreditCard creditCard = new CreditCard();
		paymentProcessor.processPayment(creditCard);
		
		System.out.println("-------------------");
		
		
		UPI upi = new UPI();
		paymentProcessor.processPayment(upi);
		
	}

}
