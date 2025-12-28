package com.oops.encapsulation;
class ATMSystem
{
	private double balance = 1000.00;
	private String pin = "1234";
	
	public void withdraw(double amountTowithdraw, String enteredPin)
	{
		System.out.println("Current Balance: " + balance);
		
		if(enteredPin.equals(enteredPin) && amountTowithdraw <= balance)
		{
			balance -= amountTowithdraw;
			System.out.println("Withdrawal amount: " + amountTowithdraw);
			System.out.println("After withdrawn amount: " + balance);
		} else
		{
			System.out.println("Invalid pin or Insuffient balance");
		}
	}
	
	public void deposit(double amountTodeposit, String enteredPin)
	{
		System.out.println("Current Balance: " + balance);
		
		if(enteredPin.equals(enteredPin) && amountTodeposit > 0)
		{
			balance += amountTodeposit;
			System.out.println("Deposited Amount: " + amountTodeposit);
			System.out.println("After depositing balance: " + balance);
		}
	}
}

public class ATMMachine {

	public static void main(String[] args) {
		
		ATMSystem  atm = new ATMSystem();
		atm.withdraw(1100, "1234");
		System.out.println("---------------\n");
		atm.deposit(5000, "1234");
		
	}

}
