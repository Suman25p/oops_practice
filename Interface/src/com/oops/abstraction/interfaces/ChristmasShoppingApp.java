package com.oops.abstraction.interfaces;

public class ChristmasShoppingApp {

	public static void main(String[] args) {
		
		ChristmasOrderService.greetCustomer(); //static method
		
		ChristmasOrderService order;
		
		order = new GiftOrderService();
		order.placeOrder("\nChristmas Tree", 3000);
		
		order= new CakeOrderService();
		order.placeOrder("\nPlum Cake",1200);
	}

}
