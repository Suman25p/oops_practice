package com.practice.exception.throwthrows;

class InsufficientBalanceException extends RuntimeException {
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}

public class ATM {
	
	static void withdraw(int balance,int amount) {
		if(amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance");
		}
		System.out.println("Withdrawl successful");
	}
	public static void main(String[] args)
	{
		
		withdraw(5000, 7000);
	}

}
