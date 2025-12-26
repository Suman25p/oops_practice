package com.oops.interfaces.multipleinheritance;

//method overloading -> same method name, different parameters
interface PaymentService
{
	void pay(double amount);
}

interface OnlinePaymentService extends PaymentService
{
	//overloaded method
	void pay(double amount,String upiId);
}

interface OfflinePaymentService extends PaymentService
{
	void pay(double amount, boolean isCash);
}

class OrderProcessor implements OnlinePaymentService, OfflinePaymentService
{
	@Override
	public void pay(double amount) {
		System.out.println("Processing basic payment of Rs. " + amount);
	}
	
	@Override
	public void pay(double amount, String upiId)
	{
		System.out.println("Processing ONLINE payment of Rs. " + amount + " using UPI ID: " + upiId);
	}
	
	@Override
	public void pay(double amount, boolean isCash) {
		if(isCash)
		{
			System.out.println("Processing OFFLINE CASH payment of Rs. " + amount);
		}else {
			System.out.println("Processing OFFLINE POS payment of Rs.  " + amount);
		}
	}
}

public class PaymentDriver {

	public static void main(String[] args) {
		OrderProcessor processor = new OrderProcessor();
		
		processor.pay(1000);
		processor.pay(2000, "suman@upi");
		processor.pay(1700, true);

	}

}
