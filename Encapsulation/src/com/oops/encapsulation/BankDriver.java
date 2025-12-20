package com.oops.encapsulation;
class BankApp
{
	private double balance;
	private int pin;
	
	public BankApp(int _pin, double _balance)
	{
		this.pin = _pin;
		this.balance = _balance;
	}
	
	public double getBalance(int enteredPin)
	{
		if(pin == enteredPin)
		{
			return balance;
		} else {
			System.out.println("Invalid PIN");
			return 0;
		}
	}
	
	public void setPin(int oldPin, int newPin)
	{
		if(pin == oldPin)
		{
			pin = newPin;
			System.out.println("PIN updated successfully");
		} else
		{
			System.out.println("Incorrect old PIN");
		}
	}
	
	public void setBalance(int enteredPin, double amount)
	{
		if(pin == enteredPin) 
		{
			if(amount >= 0) {
				balance = amount;
				System.out.println("Balance updated");
			} else {
				System.out.println("Invalid amount");
			} 
			} else {
				System.out.println("Invalid PIN");
		}
	}	
}

public class BankDriver {

	public static void main(String[] args) {
		
		BankApp account = new BankApp(2345, 10000);
		
		System.out.println("Balance: " + account.getBalance(2345));
		
		account.setPin(2345, 9999);
		account.setBalance(9999,15000);
		
		System.out.println("Updated Balance: " + account.getBalance(9999));
		
	}

}
