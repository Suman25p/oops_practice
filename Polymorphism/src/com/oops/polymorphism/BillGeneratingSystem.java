package com.oops.polymorphism;
class Bill
{
	public Order generateBill(String name, String gstNo, double amount)
	{
		System.out.println("Generating the default bill....");
		return new Order();
	}
}

class Invoice extends Bill
{
	public PlaceOrder generateBill(String name, String gstNo, double amount)
	{
		System.out.println("Generating the invoice bill with gst");
		return new PlaceOrder();
	}
}

public class BillGeneratingSystem {

	public static void main(String[] args) {
		
		Bill bill = new Bill();
		Order order1 = bill.generateBill("Deepak", "12345", 1000.0);
		order1.order();
		
		System.out.println("-------------");
		
		Bill invoice = new Invoice();
		Order order2 = invoice.generateBill("Kusum", "12367", 2000.0);
		order2.order();
	}

}
