package com.oops.abstraction;

public abstract class PaymentMethod {
	
	protected double amount;
	
	PaymentMethod(double _amount)
	{
		this.amount = _amount;
	}
	
	public abstract void validate();
	
	public abstract void pay();
	
}

class CreditCardPayments extends PaymentMethod
{
	public CreditCardPayments(double amount)
	{
		super(amount);
	}
	
	@Override
	public void validate()
	{
		System.out.println("Validating credit card details....");
	}
	
	@Override
	public void pay()
	{
		System.out.println("Paid Rs. : " + amount + " using credit card" );
	}
}

class NetBankingPayment extends PaymentMethod
{
	public NetBankingPayment(double amount)
	{
		super(amount);
	}
	
	@Override
	public void validate()
	{
		System.out.println("Validating NetBanking details.....");
	}
	
	@Override
	public void pay()
	{
		System.out.println("Paid Rs. : " + amount + " using Net Banking");
	}
}

class UPIPayments extends PaymentMethod
{
	public UPIPayments(double amount)
	{
		super(amount);
	}
	
	@Override
	public void validate()
	{
		System.out.println("Validating UPI details.....");
	}
	
	@Override
	public void pay()
	{
		System.out.println("Paid Rs. " + amount + " using UPI ");
	}
}