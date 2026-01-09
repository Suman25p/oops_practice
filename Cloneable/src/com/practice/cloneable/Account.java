package com.practice.cloneable;

public class Account implements Cloneable
{
	String accountNo;
	String ifscCode;
	
	Account(String _accountNo, String _ifscCode)
	{
		super();
		this.accountNo = _accountNo;
		this.ifscCode = _ifscCode;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{ //here Object is a return type of clone() method
		return super.clone();
	}
}
