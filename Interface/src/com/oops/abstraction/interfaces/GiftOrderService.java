package com.oops.abstraction.interfaces;

public class GiftOrderService implements ChristmasOrderService {
	
	@Override
	public void placeOrder(String itemName, double price)
	{
		System.out.println("\nGift Order Placed: " + itemName + " | Price: Rs. " + price);
		applyChristmasDiscount(price);
	}

}
