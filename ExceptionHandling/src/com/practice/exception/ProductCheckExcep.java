package com.practice.exception;

public class ProductCheckExcep 
{
	private int price;
	
	ProductCheckExcep(int price) 
	{
		if(price < 0) 
		{
			throw new IllegalArgumentException("Price can not be negative");
		}
		this.price = price;
		System.out.println("Product price: " + price);
	}
	
	public static void main(String[] args) {
		
		new ProductCheckExcep(-100);

	}

}
