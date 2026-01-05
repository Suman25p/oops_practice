package com.practice.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		int[] arr = {5, 12,33,90};
		
		try {
			System.out.println(arr[5]); //accessing invalid index
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid index! Array size is only " + arr.length);
		}
		
		System.out.println("Program continues after handling the exception. ");
	}

}
