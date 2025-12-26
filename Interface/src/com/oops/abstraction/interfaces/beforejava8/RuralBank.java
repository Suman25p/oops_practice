package com.oops.abstraction.interfaces.beforejava8;

public class RuralBank implements IBanking {

	@Override
	public void doBanking() {
		System.out.println("Doing Rural Banking");
		
	}

	@Override
	public void stopTxn() {
		
		System.out.println("Stopping transaction");
	}
	public static void main(String[] args) {
		
		RuralBank bank = new RuralBank();
		bank.doBanking();
		bank.stopTxn();
	}

}
