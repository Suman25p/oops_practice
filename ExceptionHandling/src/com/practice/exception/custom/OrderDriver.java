package com.practice.exception.custom;

class OutOfStockException extends Throwable
{
	public OutOfStockException(String message)
	{
		super(message);
	}
}

class InventoryService {
	public void placeOrder(String product, int quantity) throws OutOfStockException {
		int availableStock = 5;
		
		if(quantity > availableStock) {
			throw new OutOfStockException(product + " is out of stock");
		}
		System.out.println("Order placed for " + product);
	}
}

public class OrderDriver {

	public static void main(String[] args) {
		InventoryService service = new InventoryService();
		
		try {
			service.placeOrder("Laptop",6);
		} catch (OutOfStockException e) {
			
			System.out.println("Order failed: " + e.getMessage());
		}

	}

}
