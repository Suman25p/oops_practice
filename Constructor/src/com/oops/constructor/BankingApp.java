package com.oops.constructor;

class Account
{
	String holderName;
	double balance;
	
	Account(String _holderName,double _balance) {
		if(_balance < 1000)
		{
			throw new RuntimeException("Minimum balance must be 1000");
		}
		
		this.holderName = _holderName;
		this.balance = _balance;
		System.out.println("Account created for: " + holderName);
	}
}

class KYCAccount extends Account {
	int age;
	String aadhaar;
	
	KYCAccount(String _holderName, double _balance, int _age, String _aadhar) 
	{
		super(_holderName, _balance);
		
		if(_age < 18) {
			throw new RuntimeException("KYC failed: Underage");
		}
		
		if(_aadhar.length() != 12) {
			throw new RuntimeException("Invalid Aadhar Number");
		}
		
		this.age = _age;
		this.aadhaar = _aadhar;
		System.out.println("KYC completed");
	}
}

class LoanAccount extends KYCAccount {
	double loanAmount;
	int creditScore;
	double interestRate;
	
	LoanAccount(String _name, double _balance, int _age,String _aadhaar) {
		this(_name, _balance, _age, _aadhaar, 0, 0);
		System.out.println("Basic Loan Account Inirialized");
	}
	
	LoanAccount(String _name, double _balance, int _age, String _aadhar,double _loanAmount, int _creditScore) {
		super(_name, _balance, _age, _aadhar);
		
		this.loanAmount = _loanAmount;
		this.creditScore = _creditScore;
		calculateInterest();
	}
	
	void calculateInterest() 
	{
		if(creditScore >= 750) {
			interestRate = 8.5;
		}else if(creditScore >= 650) {
			interestRate = 10.5;
		}else {
			throw new RuntimeException("Loan Rejected: Low Credit Score");
		}
		
		System.out.println("Loan Approved");
		System.out.println("Interest Rate: " + interestRate + "%");
	}
}

public class BankingApp 
{

	public static void main(String[] args) 
	{
		
		new LoanAccount("Payal", 15000, 25, "123456789012",500000, 780);

	}

}
