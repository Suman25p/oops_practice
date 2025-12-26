package com.oops.interfaces.multipleinheritance;

interface OrderById
{
	void placeOrder(int orderId);
	void placeOrder(String productName);
}

interface OrderByName
{
	void placeOrder(String productName);
}

class OrderrService implements OrderById,OrderByName
{
	@Override
	public void placeOrder(int orderId)
	{
		System.out.println("Order placed using Order ID: " + orderId);
	}
	
	@Override
	public void placeOrder(String productName) {
		System.out.println("Order placed for Product: " + productName);
	}
}

public class OrderDriver {

	public static void main(String[] args) {
		OrderrService service = new OrderrService();
		service.placeOrder(12345);
		service.placeOrder("Think and grow rich - book");
	}

}
