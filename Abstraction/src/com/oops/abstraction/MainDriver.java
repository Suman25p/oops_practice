package com.oops.abstraction;

abstract class Bank
{
	abstract void loanInterestRate();
}

class HDFC extends Bank
{
	@Override
	void loanInterestRate()
	{
		System.out.println("Interest rate of HDFC bank is 8.2%");
	}
}

class SBI extends Bank
{
	@Override
	void loanInterestRate()
	{
		System.out.println("Interest Rate of SBI bank is 8.0%");
	}
}

public class MainDriver {

	public static void main(String[] args) {
		
		Bank hdfc = new HDFC();
		hdfc.loanInterestRate();
		
		System.out.println("----------------------------");
		
		Bank sbi = new SBI();
		sbi.loanInterestRate();
	}

}
