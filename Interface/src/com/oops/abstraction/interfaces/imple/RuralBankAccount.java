package com.oops.abstraction.interfaces.imple;


public class RuralBankAccount implements IDFCAccount,SBIAccount{
	
	@Override
	public void manageAccount() {
		System.out.println("Managing Rural Bank Account...");
	}
	
	public static void main(String[] args)
	{
		RuralBankAccount rb = new RuralBankAccount();
		rb.manageAccount();
		
//		SBIAccount sbi = new RuralBankAccount();
//		sbi.manageAccount();
//		
//		IDFCAccount idfc = new RuralBankAccount();
//		idfc.manageAccount();
	}
}

// Managing Rural Bank Account...
