package com.oops.constructor;
class Bank
{
	String bankName;
	String ifsc;
	
	Bank(String _bankName, String _ifsc)
	{
		this.bankName = _bankName;
		this.ifsc = _ifsc;
		System.out.println("Customer Details-------");
		System.out.println("Bank Name: " + bankName);
		System.out.println("IFSC Code: " + ifsc);
	}
}
public class Customer extends Bank{
	
	String name;
	long accNo;
	
	Customer(String _bankName, String _ifsc , String _name, long _accNo)
	{
		super(_bankName, _ifsc);
		this.name = _name;
		this.accNo = _accNo;
		
		System.out.println("Name: " + name);
		System.out.println("Account No: " + accNo);
	}
	
	public static void main(String[] args) {
		
		new Customer("SBI" , "SBICN1002", "Suraj Chauhan", 400012123456L);

	}

}
