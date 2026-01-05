package com.practice.exception;

public class Driver {

	public static void main(String[] args) 
	{
		int number = 20;
		int result = 0;
		
		try {
		result = number/0;
		}
		catch (ArithmeticException e) {
			System.out.println("Can not divide by zero!");
		}
		
		System.out.println("Result: " + result);
		
	}

}
