package com.oops.polymorphism;

class Banking
{
	public void doFundTransfer()
	{
		System.out.println("Banking.doFundTransfer().......");
	}
}

class UPI extends Banking
{
	@Override
	public void doFundTransfer()
	{
		System.out.println("UPI.doFundTransfer().......");
	}
}

class CreditCard extends Banking
{
	@Override
	public void doFundTransfer()
	{
		System.out.println("CreditCard.doFundTransfer().......");
	}
}
