package com.oops.constructor;
class Order2
{
	double amount;
	
	Order2(double _amount) {
		this.amount = _amount;
	}
}

class DiscountOrder extends Order2 
{
	double discount;
	
	DiscountOrder(double _amount, double _discount)
	{
		super(_amount);
		this.discount = _discount;
	}
	
	void finalAmount() {
		double finalPrice = amount - discount;
		System.out.println("Final Amount: " + finalPrice);
	}
}

public class Shop {

	public static void main(String[] args) {
		DiscountOrder order = new DiscountOrder(2000, 300);
		order.finalAmount();

	}

}
