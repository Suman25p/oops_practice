package com.practice.exception.finally1;

public class Driver {
	
	public static int dividingNumber()
	{
		int number = 100;
		int input = 10;
		try {
			System.out.println("Inside try block");
			int result = number /input;
			System.out.println("try result: " + result);
			return result;
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			int result = 200/5;
			System.out.println("\nFinally Result: " +  result);
			return result;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Inside Main method");
		System.out.println("\nResult in main method: " + Driver.dividingNumber());	
	}

}
