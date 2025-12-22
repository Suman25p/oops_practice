package com.oops.inheritance;
class Account2
{
	public void whichOne()
	{
		System.out.println("Heritage");
	}
}

class SavingAccounts extends Account2
{
	public void what()
	{
		System.out.println("College");
	}
}

public class PremiumSavingAccount extends SavingAccounts
{
	public void where()
	{
		System.out.println("Kolkata");
		
	}
	public static void main(String[] args)
	{
		PremiumSavingAccount premiumSavingAccount = new PremiumSavingAccount();
		premiumSavingAccount.whichOne();
		premiumSavingAccount.what();
		premiumSavingAccount.where();
	}
}
