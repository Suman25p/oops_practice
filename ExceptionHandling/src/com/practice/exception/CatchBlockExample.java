package com.practice.exception;

public class CatchBlockExample {

	public static void main(String[] args) {
		System.out.println("Inside Main method...");
		String name = null;
		int number = 100;
		int input = 10;
		try
		{
			System.out.println("Inside try block...");
			int result = number/input;
			System.out.println("Result: " + result);
			int stringLength = name.length();
			System.out.println("String length: " + stringLength);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occured!!");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null value found");
		}
		catch(Exception e)
		{
			System.out.println("Somthing went wrong!!");
		}
	}
}
