package com.oops.constructor;

class Guest
{
	int age;
	
	Guest(int age)
	{
		this.age = age;
		System.out.println("Guest age: " + age);
	}
}

class Room extends Guest
{
	boolean available;
	
	Room(int age, boolean available)
	{
		super(age);
		this.available = available;
		System.out.println("Room available: " + available);
	}
}

class Payment extends Room
{
	double amount;
	Payment(int age, boolean available, double amount)
	{
		super(age, available);
		
		if(age >= 18 && available) {
			this.amount = amount;
			System.out.println("Payment successful: " + amount);
		} else {
			System.out.println("Booking failed");
		}
	}
}
public class HotelApp {

	public static void main(String[] args) {
		new Payment(25, true, 3000);
	}

}
