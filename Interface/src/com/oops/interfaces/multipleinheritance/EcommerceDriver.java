package com.oops.interfaces.multipleinheritance;

interface PaymentPolicy
{
	boolean validatePayment(double amount);
	
	double applyCharges(double amount);
}

interface OnlinePaymentPolicy extends PaymentPolicy
{
	
}

interface OfflinePaymentPolicy extends PaymentPolicy
{
	
}

class OrderService implements OnlinePaymentPolicy,OfflinePaymentPolicy
{
	private double walletBalance = 5000;
	
	@Override
	public boolean validatePayment(double amount)
	{
		return walletBalance >= amount;
	}
	
	@Override
	public double applyCharges(double amount)
	{
		double serviceCharge = amount * 0.02;
		double totalCharge = amount + serviceCharge;
		return totalCharge;
	}
	
	public void placeOrder(double amount)
	{
		if(!validatePayment(amount))
		{
			System.out.println("X Payment failed: Insufficient balance");
			
		}
		double finalAmount = applyCharges(amount);
		walletBalance -= finalAmount;
		
		System.out.println("Order placed successfully");
		System.out.println("Final Amount Charged: Rs." + finalAmount);
		System.out.println("Remaining Wallet Balance: Rs." + walletBalance);
	}
}

public class EcommerceDriver {

	public static void main(String[] args) {
		OrderService service = new OrderService();
		service.placeOrder(2000);

	}

}
