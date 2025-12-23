package com.oops.polymorphism;

class Order 
{
	public void order()
	{
		System.out.println("Order Created");
	}
}

class PlaceOrder extends Order
{
	
	public void order()
	{
		System.out.println("Order Placed successfully");
	}
}
