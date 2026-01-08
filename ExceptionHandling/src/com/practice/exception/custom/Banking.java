package com.practice.exception.custom;

public class Banking 
{
	
	int balance = 1000;
	public void doFundTransfer(int amount) throws InsufficientBalanceException{
		if(balance < amount)
		{
			throw new InsufficientBalanceException("Insufficient amount");
		}
		else
		{
			System.out.println("Banking.doFundTransfer() is ready to transfer money " + amount);
		}
	}

}
