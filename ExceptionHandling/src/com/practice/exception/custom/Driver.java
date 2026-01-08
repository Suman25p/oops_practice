package com.practice.exception.custom;

class InsufficientBalanceException extends RuntimeException
{
	public InsufficientBalanceException(String message)
	{
		super(message);
	}
}

public class Driver {

	public static void main(String[] args) {
		
		Banking banking = new Banking();
		banking.doFundTransfer(1500);

	}

}
