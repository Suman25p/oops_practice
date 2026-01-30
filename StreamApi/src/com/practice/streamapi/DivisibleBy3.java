package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;

public class DivisibleBy3 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(5, 7,10,14);
		
		System.out.println("Input numbers: " + numbers);
		
		boolean match = numbers.stream().anyMatch(n -> n % 3 ==0);
		
		System.out.println(match);
	}

}
