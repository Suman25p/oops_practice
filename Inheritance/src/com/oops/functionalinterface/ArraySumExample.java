package com.oops.functionalinterface;

//Sum of Array Elements

@FunctionalInterface
interface ArraySum
{
	int sum(int[] arr);
}

public class ArraySumExample {

	public static void main(String[] args) {
		
		ArraySum arraySum = arr -> {
			int sum = 0;
			for(int num : arr)
			{
				sum += num;
			}
			return sum;
		};
		
		int[] nums = {12, 23, 46, 89};
		System.out.println("Sum of Array elements: " + arraySum.sum(nums));

	}

}
