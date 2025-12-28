package com.oops.interfaces.java9;

public interface IUtility 
{
	default void execute(int value)
	{
		if(isPositive(value))
		{
			print(value);
		}
	}
	
	private static boolean isPositive(int value)
	{
		return value > 0;
	}
	
	private static void print(int value)
	{
		if(isPositive(value))
		{
			System.out.println("Valid value: " + value);
		}
	}
}
