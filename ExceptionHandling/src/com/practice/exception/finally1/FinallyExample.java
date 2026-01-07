package com.practice.exception.finally1;

public class FinallyExample {

	public static void main(String[] args) {
		
		System.out.println("Inside MAIN Method");
		int number = 100;
		int input = 0;
		
		try {
			System.out.println("Inside try block..");
			
			int result = number/input;
			
			System.out.println("Result: " + result);
			System.out.println("Exit try block");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occured");
		}
		
		finally
		{
			System.out.println("\nFinally block executed");
		}
	}

}
