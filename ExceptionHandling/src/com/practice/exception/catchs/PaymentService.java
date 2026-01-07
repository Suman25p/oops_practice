package com.practice.exception.catchs;

public class PaymentService {

	public static void main(String[] args) {
		
		try {
			int amount = Integer.parseInt("10A0");
			
			int result = amount/0;
			
			System.out.println("Payment Successful");
		}
		catch(NumberFormatException | ArithmeticException e)
		{
			System.out.println("Payment processing failed");
		}

	}

}
