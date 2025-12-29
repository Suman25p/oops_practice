package com.oops.functionalinterface;

@FunctionalInterface
interface Payment
{
	public abstract void pay(double amount);
}

public class OnlinePaymentApp {

	public static void main(String[] args) {
		
		//UPI payment
		Payment upi = amount -> System.out.println("Paid $: " + amount + " using upi");
		
		//Credit Card Payment
		Payment credit = amount -> System.out.println("Paid $: " + amount + " using credit card");
		
		//NetBanking Payment
		Payment net = amount -> System.out.println("Paid $: " + amount + " using net banking");
		
		
		upi.pay(800);
		credit.pay(300);
		net.pay(1000);
		
	}

}
