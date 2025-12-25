package com.oops.abstraction.interfaces;

public interface ChristmasOrderService {
	
	public abstract void placeOrder(String itemName, double price);
	
	default void applyChristmasDiscount(double price)
	{
		double discount = price * 0.20;
		System.out.println("Christmas Discount Applied: Rs." + discount);
	}
	
	static void greetCustomer() {
		System.out.println("\nWelcome! Enjoy Christmas Shopping ");
	}
	
}
