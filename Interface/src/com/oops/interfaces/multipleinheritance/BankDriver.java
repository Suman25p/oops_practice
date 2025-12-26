package com.oops.interfaces.multipleinheritance;

interface BankService {
	public abstract void withdraw(double amount);
}

interface ATMService extends BankService
{
	
}

interface NetBankingService extends BankService
{
	
}

class CustomerAccount implements ATMService, NetBankingService {
	
	@Override
	public void withdraw(double amount)
	{
		System.out.println("Withdrawing Rs. " + amount + " from customer account");
	}
}

public class BankDriver {

	public static void main(String[] args) {
		
		CustomerAccount acc = new CustomerAccount();
		acc.withdraw(2000);

	}

}
