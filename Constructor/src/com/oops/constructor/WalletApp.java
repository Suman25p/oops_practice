package com.oops.constructor;
class WalletUser
{
	boolean kycDone;
	
	WalletUser(boolean kycDone)
	{
		this.kycDone = kycDone;
		System.out.println("KYC Done: " + kycDone);
	}
}

class Wallet extends WalletUser
{
	double balance;
	
	Wallet(boolean kycDone, double balance)
	{
		super(kycDone);
		this.balance = balance;
		System.out.println("Wallet balance: " + balance);
	}
}

class Transaction extends Wallet {
	double amount;
	
	Transaction(boolean kycDone, double balance, double amount)
	{
		super(kycDone, balance);
		
		if(kycDone && amount <= balance)
		{
			this.balance-= amount;
			
			System.out.println("Transaction sucess | Remaining: " + this.balance);
		} else {
			System.out.println("Transaction failed");
		}
	}
}

public class WalletApp {

	public static void main(String[] args) {
		
		new Transaction(true, 2000, 750);

	}

}
