package com.oops.abstraction;
abstract class Account
{
	double balance;
	Account(double balance)
	{
		this.balance = balance;
	}
	
	abstract void calculateInterest();
	
	void showBalance()
	{
		System.out.println("Current Balance: " + balance);
	}
}

class SavingAccount extends Account
{
	double interestRate = 5.0;
	SavingAccount(double balance)
	{
		super(balance);
	}
	
	@Override
	void calculateInterest()
	{
		double interest = (balance * interestRate) / 100;
		balance += interest;
		System.out.println("Interest added: " + interest);
		System.out.println("After Interest total balance: " + balance);
	}
}

class CurrentAccount extends Account
{
	CurrentAccount(double balance)
	{
		super(balance);	
	}
	
	@Override
	void calculateInterest()
	{
		System.out.println("No Interest for Current Account");
		System.out.println("So Current Acccount total balance: " + balance);
	}
}

public class BankSystem {

	public static void main(String[] args) {
		
		Account saving = new SavingAccount(5000);
		saving.calculateInterest();
		
		System.out.println("------------------------");
		
		Account current = new CurrentAccount(10000);
		current.calculateInterest();

	}

}
