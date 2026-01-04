package com.oops.markerinterface;

interface FastDelivery
{
	
}

class Product
{
	String name;
	Product(String _name)
	{
		this.name = _name;
	}
}

class PrimeProduct extends Product implements FastDelivery
{
	PrimeProduct(String name)
	{
		super(name);
	}
}

public class DeliveryService {
 
	 static void ship(Product product) {
		 if(product instanceof FastDelivery) {
			 System.out.println(product.name + "Fast Delivery");
		 } else {
			 System.out.println(product.name + "Normal Delivery");
		 }
	 }
	 
	public static void main(String[] args) {
		Product phone = new Product("Android Phone");
        Product laptop = new PrimeProduct("Laptop");

        ship(phone);
        ship(laptop);

	}

}
