package com.oops.constructor;
class UserPerson
{
	String name;
	boolean verified;
	
	UserPerson(String name, boolean varified)
	{
		this.name = name;
		this.verified = varified;
		System.out.println("Passenger Name: " + name);
		System.out.println("User verification status : " + verified);
	}
}

class Ticket extends UserPerson
{
	double price;
	
	Ticket(String name, boolean verified, double price)
	{
		super(name, verified);
		
		if(verified && price > 0) {
			this.price = price;
			System.out.println("Ticket booked with price: " + price);
		} else {
			System.out.println("Ticket booking failed");
		}
	}
}

class BoardingPass extends Ticket 
{
	String seatNo;
		
	BoardingPass(String name, boolean verified, double price, String seatNo)
	{
		super(name, verified, price);
			
		if(verified && price > 0)
		{
			this.seatNo = seatNo;
			System.out.println("Boarding pass generated | Seat: " + seatNo);
		}
	}
}

public class FlightApp 
{

	public static void main(String[] args) 
	{
		
		new BoardingPass("Manshi", true ,5500, "12A");

	}

}
