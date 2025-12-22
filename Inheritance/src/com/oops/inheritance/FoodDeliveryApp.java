package com.oops.inheritance;

class FoodOrder
{
	protected int orderId;
	protected String customerName;
	protected double baseAmount;
	
	public FoodOrder(int orderId, String customerName, double baseAmount)
	{
		this.orderId = orderId;
		this.customerName = customerName;
		this.baseAmount = baseAmount;
	}
	
	public double calculateFinalAmount()
	{
		return baseAmount;
	}
	
	public void printOrder()
	{
		System.out.println("Order ID: " + orderId);
		System.out.println("Customer: " + customerName);
		System.out.println("Base Amount: " + baseAmount);
	}
}

class NormalOrder extends FoodOrder
{
	private static final double DELIVERY_CHARGE = 40;
	
	public NormalOrder(int orderId, String customerName, double baseAmount) {
		super(orderId, customerName, baseAmount);
	}
	
	@Override
	public double calculateFinalAmount() {
		return baseAmount + DELIVERY_CHARGE;
	}
}

class PrimeOrder extends FoodOrder
{
	private static final double DISCOUNT = 0.10;
	
	public PrimeOrder(int orderId, String customerName, double baseAmount)
	{
		super(orderId, customerName, baseAmount);
	}
	
	@Override
	public double calculateFinalAmount() {
		double discountAmount = baseAmount * DISCOUNT;
		return baseAmount - discountAmount;
	}
}

class BulkOrder extends FoodOrder
{
	private static final double PACKAGING_CHARGE = 100;
	
	public BulkOrder(int orderId, String customerName, double baseAmount)
	{
		super(orderId, customerName,baseAmount);
	}
	
	@Override
	public double calculateFinalAmount() {
		double bulkDiscount = baseAmount * 0.15;
		return baseAmount + PACKAGING_CHARGE - bulkDiscount;
	}
}

public class FoodDeliveryApp {
	
	public static void processOrder(FoodOrder order) {
		order.printOrder();
		System.out.println("Final Amount: " + order.calculateFinalAmount());
		System.out.println("------------------");
	}
	
	public static void main(String[] args) {
		
		FoodOrder order1 = new NormalOrder(101, "Suman", 500);
		FoodOrder order2 = new PrimeOrder(102, "Rahul", 800);
		FoodOrder order3 = new BulkOrder(103, "Neha", 2000);
		
		processOrder(order1);
		processOrder(order2);
		processOrder(order3);
		
	}
	
}
