package com.oops.functionalinterface;

//Count Even Numbers in Array

@FunctionalInterface
interface CountLogic
{
	public abstract int count(int[] arr);
}

public class CountEvenNumber {

	public static void main(String[] args) {
		
		CountLogic countEven = arr ->
		{
			int count = 0;
			for(int num : arr)
			{
				if(num % 2 == 0)
					count++;
			}
			return count;
		};
		int[] inputData = { 12, 24, 67,80, 100,11, 27};
		System.out.println("Total Even numbers: " + countEven.count(inputData));
	}

}
