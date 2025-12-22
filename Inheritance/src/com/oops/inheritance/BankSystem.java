package com.oops.inheritance;

class Account
{
	double balance;
	
	public Account(double _balance)
	{
		this.balance = _balance;	
	}
	
	public void showBalance()
	{
		System.out.println("Account balance: " + balance);
	}
}

class SavingAccount extends Account
{
	double interestRate;
	
	public SavingAccount(double balance, double interestRate)
	{
		super(balance);
		this.interestRate = interestRate;
	}
	
	public void calculateInterest()
	{
		double interest = balance * interestRate /100;
		double totalBalance = balance + interest;
		System.out.println("Interest Earned: " + interest);
		System.out.println("Total Balance: " + totalBalance);
	}
}

public class BankSystem {

	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount(10000, 6);
		sa.showBalance();
		sa.calculateInterest();
		
	}

}
