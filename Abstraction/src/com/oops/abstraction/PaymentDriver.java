package com.oops.abstraction;
abstract class Payment
{
	//static method common rule for all payments
	static boolean validateAmount(double amount)
	{
		return amount > 0;
	}
	
	abstract void processPayment(double amount);
}

class CreditCardPayment extends Payment
{
	@Override
	void processPayment(double amount) {
		if(Payment.validateAmount(amount))
		{
			System.out.println("Credit card payment processed: " + amount);
		}
		else
		{
			System.out.println("Invalid amount for credit card payment");
		}
	}
}
 
class UPIPayment extends Payment
{
	@Override
	void processPayment(double amount)
	{
		if(Payment.validateAmount(amount))
		{
			System.out.println("UPI payment processed: " + amount);
		}else {
			System.out.println("Invalid amount for upi payment");
		}
	}
}
 
public class PaymentDriver {

	public static void main(String[] args) {
		
		Payment credit = new CreditCardPayment();
		credit.processPayment(2000);
		
		System.out.println("-----------------------------------");
		
		Payment upi = new UPIPayment();
		upi.processPayment(3000);

	}

}
