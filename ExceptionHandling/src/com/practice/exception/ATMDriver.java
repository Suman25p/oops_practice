package com.practice.exception;
class ATMService {
	static void withdraw(int balance, int withdrawAmount)
	{
		try {
			System.out.println("ATM Processing withdrawal....");
			
			if(withdrawAmount <= 0) {
				throw new IllegalArgumentException("Invalid withdrawal amount");
			}
			if(withdrawAmount > balance)
			{
				throw new ArithmeticException("Insufficient balance");
			}
			
			int remainingBalance = balance - withdrawAmount;
			System.out.println("Remaining Balance: " + remainingBalance);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Transaction Failed: " + e.getMessage());
		}
		finally
		{
			System.out.println("ATM : Please take your card");
			System.out.println("ATM: session closed");
		}
	}
}

public class ATMDriver {

	public static void main(String[] args) {
		
		System.out.println("Customer enters ATM\n");
		ATMService.withdraw(5000,7000);
		System.out.println("\nCustomer leaves ATM");

	}

}

/*
Customer enters ATM

ATM Processing withdrawal....
Transaction Failed: Insufficient balance
ATM : Please take your card
ATM: session closed

Customer leaves ATM
*/
