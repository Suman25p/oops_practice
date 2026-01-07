package com.practice.exception;

public class BankAccount 
{
	private double balance;
	
	public BankAccount(double balance) {
		if(balance < 0) {
			throw new IllegalArgumentException("Balance cannot be negative");
		}
		this.balance = balance;
		System.out.println("Account created with balance: " + balance);
	}
	
	public static void main(String[] args) {
		new BankAccount(-500);

	}

}
