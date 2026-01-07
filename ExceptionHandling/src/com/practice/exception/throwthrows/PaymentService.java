package com.practice.exception.throwthrows;

import java.io.IOException;

public class PaymentService {
	
	static void processPayment(int amount) throws IOException
	{
		if(amount <= 0) {
			throw new IllegalArgumentException("Invalid payment amount");
		}
		
		if(amount > 1000) {
			throw new IOException("Payment gateway timeout");
		}
		
		System.out.println("Payment Successful");
	}
	
	public static void main(String[] args) {
		try
		{
			processPayment(15000);
	
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
