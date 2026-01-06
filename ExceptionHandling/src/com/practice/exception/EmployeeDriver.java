package com.practice.exception;

public class EmployeeDriver 
{

	public static void main(String[] args) {
		
		String name = null;
		int length = 0;
		
		try
		{
		length = name.length();
		} 
		catch(NullPointerException e)
		{
			System.out.println("Somthing wrong!!");
		}
		System.out.println(length);
	}

}
