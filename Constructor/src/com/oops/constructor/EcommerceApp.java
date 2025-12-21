package com.oops.constructor;

class User
{
	String username;
	boolean loggedIn;
	
	User(String username, boolean loggedIn) {
		this.username = username;
		this.loggedIn = loggedIn;
		
		if(!loggedIn) 
		{
			throw new RuntimeException("User not logged in");
		}
		System.out.println("User name: " + username);
		System.out.println("User authenticated");
	}
}

class Cart extends User
{
	int itemCount;
	
	Cart(String username, boolean loggedIn, int itemCount) {
		super(username, loggedIn);
		
		if(itemCount <= 0) {
			throw new RuntimeException("Cart is empty");
		}
		this.itemCount = itemCount;
		System.out.println("Cart validated");
	}
}

class Order extends Cart 
{
	double amount;
	
	Order(String username, boolean loggedIn, int itemCount, double amount) {
		super(username, loggedIn, itemCount);
		this.amount = amount;
		if(amount <= 0) {
			throw new RuntimeException("Invalid payment amount");
		}
		System.out.println("Order placed successfully");
	}
}

public class EcommerceApp 
{

	public static void main(String[] args) {
		new Order("Sonam", true, 3, 2500);
	}

}
