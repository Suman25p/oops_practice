package com.practice.exception;

public class ExceptionExamples {

	public static void main(String[] args) 
	{
		System.out.println("ExceptionExample.main()- STARTED");
		int[] arr = {1,2,3};
		System.out.println(arr[5]);
		System.out.println("This line won't execute");
		System.out.println("ExceptionExample.main() - ENDED");

	}

}
