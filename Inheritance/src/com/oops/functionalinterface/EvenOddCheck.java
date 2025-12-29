package com.oops.functionalinterface;

@FunctionalInterface
interface NumberCheck
{	
	boolean check(int number);

}

public class EvenOddCheck {

	public static void main(String[] args) {
		
		NumberCheck isEven = number -> number % 2 == 0;
		
		System.out.println(isEven.check(23));//false
		System.out.println(isEven.check(20)); //true
	}

}
