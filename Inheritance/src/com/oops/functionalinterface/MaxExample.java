package com.oops.functionalinterface;

// Find Maximum of Two Numbers
interface MaxFinder
{
	int findMax(int num1, int num2);
}

public class MaxExample {

	public static void main(String[] args) {
		
		MaxFinder max = (num1,num2) ->
		{
			int result = num1 > num2 ? num1 : num2;
			return result;
		};
		
		System.out.println("Maximum number: " + max.findMax(20, 900));
		
		System.out.println("---------------------------------------------");
		
		MaxFinder max2 = (num1, num2) -> (num1 > num2) ? num1 : num2;
		
		System.out.println("Maximum number: " + max2.findMax(12, 10));
	}

}
