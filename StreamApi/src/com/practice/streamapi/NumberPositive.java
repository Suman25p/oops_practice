//Check All no. are positive
package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;

public class NumberPositive {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(5,10,3,9,2);
		
		System.out.println("Input Number: " + numbers);
		
		boolean match  = numbers.stream().allMatch(n -> n>0);
		
		System.out.println(match);
				
	}

}
