package com.practice.exception.custom;

class InvalidOrderDataException extends RuntimeException{
	
	public InvalidOrderDataException(String message)
	{
		super(message);
	}
}

class OrderValidator 
{
	public static void validateOrder(String orderId, double amount) {
		if(orderId == null || orderId.isEmpty()) {
			throw new InvalidOrderDataException("Order ID cannot be null or empty");
		}
		if(amount <= 0)
		{
			throw new InvalidOrderDataException("Order amount must be positive");
		}
	}
}

public class OrderValidationDriver {

	public static void main(String[] args) {
		
		OrderValidator.validateOrder(null, 1000);
		System.out.println("Order Validated");

	}

}
