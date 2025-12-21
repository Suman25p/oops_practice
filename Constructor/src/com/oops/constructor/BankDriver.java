package com.oops.constructor;
class BankAccount
{
	String accountHolder;
	double balance;
	
	BankAccount(String _accountHolder, double _balance)
	{
		this.accountHolder = _accountHolder;
		this.balance = _balance;
		System.out.println("Cureent balance: " + balance);
	}	
}

class SavingsAccount extends BankAccount
{
	double interestRate;
	
	SavingsAccount(String accountHolder, double balance, double _interestRate) {
		super(accountHolder, balance);
		this.interestRate = _interestRate;
	}
	
	void calculateInterest() {
		double interest = balance * interestRate / 100;
		System.out.println("Interest: " + interest);
	}
	
	void showBalance() {
		System.out.println("Final balance: " + balance);
	}
}

public class BankDriver {

	public static void main(String[] args) {
		SavingsAccount account = new SavingsAccount("Seema", 10000, 5);
		account.calculateInterest();
		account.showBalance();

	}

}
