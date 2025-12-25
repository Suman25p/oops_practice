package com.oops.abstraction.interfaces;

public class CakeOrderService implements ChristmasOrderService {
	
	@Override
	public void placeOrder(String itemName, double price) {
		System.out.println("\nCake Order Placed: " + itemName + " | Price: Rs." + price);
		applyChristmasDiscount(price);
	}

}
