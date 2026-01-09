package com.practice.cloneable;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException{
		Account account1 = new Account("12345689", "SBI9081");
		//Account account2 = 
		Account account2 = (Account) account1.clone();
		account2.accountNo = "87654"; //changed value of accountNo
		System.out.println(account2.accountNo);
		
		System.out.println(account1 == account2); //false(Comparing state of an object)
		System.out.println(account1.equals(account2)); //false 
	}

}
