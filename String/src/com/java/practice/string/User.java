package com.java.practice.string;

final class BankAccount
{
	String name;
	BankAccount(String _name)
	{
		this.name = _name;
		System.out.println("Bank Name: " + name);
	}
}

//class SavingAccount extends BankAccount
//{
//	//The type SavingAccount cannot subclass the final class BankAccount
//}

public class User {

	public static void main(String[] args) {
		
		 new BankAccount("SBI");

	}

}
