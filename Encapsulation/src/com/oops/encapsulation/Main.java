package com.oops.encapsulation;
class BankAccount
{
	private double balance;
	
	public BankAccount(double _balance)
	{
		this.balance = _balance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposit(double amount)
	{
		if(amount > 0)
		{
			balance += amount;
			System.out.println("Deposited amount : " + amount);
			System.out.println("After Deposit Total Balance: " + balance);
		} else
		{
			System.out.println("Invalid amount!");
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount > 0 && amount <= balance)
		{
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
			System.out.println("After Withdrawn Total Balance: " + balance);
		}
	}
}

public class Main {

	public static void main(String[] args) 
	{
		BankAccount account = new BankAccount(10000);
		account.deposit(5000);
		account.withdraw(3000);
		
		System.out.println("Final Balance: " + account.getBalance());

	}

}
