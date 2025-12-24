package com.oops.abstraction;
abstract class BankAccount
{
	double balance;
	
	BankAccount(double _balance)
	{
		this.balance = _balance;
	}
	
	abstract double calculateInterest();
}

class SavingAccounts extends BankAccount
{
	double interestRate = 0.04;
	SavingAccounts(double _balance)
	{
		super(_balance);
	}
	
	@Override
	double calculateInterest()
	{
		double interest = balance * 0.04;
		return interest;
		
	}
}

class FixedDepositAccount extends BankAccount
{
	double interestRate = 0.07;
	FixedDepositAccount(double _balance)
	{
		super(_balance);
	}
	
	@Override
	double calculateInterest()
	{
		double interest = balance * 0.07;
		return interest;
	}
}


public class BankDriver {

	public static void main(String[] args) {
		
		BankAccount sa = new SavingAccounts(10000);
		System.out.println("Saving Interest: " + sa.calculateInterest());
		
		System.out.println("---------------------------");
		
		BankAccount fda = new FixedDepositAccount(2000);
		System.out.println("FD Interest: " + fda.calculateInterest()) ;
		

	}

}
