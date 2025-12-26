package com.oops.abstraction.interfaces.java8.staticc;

public class KotakBank implements IBanking{
	
	@Override
	public void doFundTransfer() {
		System.out.println("KotakBank.doFundTransfer()....");
	}
	
	void printPassBook()
	{
		IBanking.printPassbook("Kotak Bank" , "kotakLogo");
	}
	
	public static void main(String[]  args)
	{
		KotakBank bank = new KotakBank();
		bank.doFundTransfer();
		bank.printPassBook();
	}
}
