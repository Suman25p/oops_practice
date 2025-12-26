package com.oops.abstraction.interfaces.java8.staticc;

public class SBIBank implements IBanking {
	
	@Override
	public void doFundTransfer() {
		System.out.println("SBIBank.doFundTransfer()....");
	}

	void printPassBook()
	{
		IBanking.printPassbook("Kotak Bank" , "kotakLogo");
	}
	
	public static void main(String[]  args)
	{
		IBanking.printPassbook("Kotak" , "logo"); //direct static method call
		
		
		SBIBank bank = new SBIBank();
		bank.doFundTransfer();
		bank.printPassBook();
	}
}

//
//Printing Passbook Kotak with logo : logo
//SBIBank.doFundTransfer()....
//Printing Passbook Kotak Bank with logo : kotakLogo
