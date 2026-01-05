package com.practice.exception;

public class EmployeeDetails {

	public static void main(String[] args) {
		
		String name = null;
		String empId = null;
		String city = null;
		
		try 
		{
			System.out.println("Entering into try block");
			name = args[0];
			empId = args[1];
			city = args[2];
			System.out.println("Exit from try block");
		} 
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Something is wrong!!");
		}
		
		System.out.println("Employee Details:-");
		System.out.println("Name: " + name + "\nEmployee ID: " + empId + "\nCity:  " + city);

	}

}
