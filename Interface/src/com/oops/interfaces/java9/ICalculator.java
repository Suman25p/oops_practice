package com.oops.interfaces.java9;

interface ICalculator 
{
	//abstract method
	public abstract void calculate(int num1 , int num2);
	
	//default method
	default void process(int num1, int num2)
	{
		if(isValid(num1, num2))
		{
			calculate(num1, num2);
		} else {
			System.out.println("Invalid numbers");
		}
	}
	
	//private static method (Java 9+)
	private static boolean isValid(int num1, int num2)
	{
		return  num1 > 0 && num2 > 0;
	}
}
