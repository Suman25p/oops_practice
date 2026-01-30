package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Hi","Java","Go","IT","Bangalore");
		
		System.out.println("Input: "  + list);
		
		//finding String which is greater than 3
		List<String> result = list.stream().filter(n -> n.length() >3)
				.collect(Collectors.toList());
		
		System.out.println("Result: " + result);
		
		//Length of each String
		List<Integer> output = list.stream().map(n -> n.length()).toList();
		System.out.println("Length of String: " + output);
		
		//Find starts with B and convert to uppercase
		List<String> output2 = list.stream()
					.filter(s -> s.startsWith("B"))
					.map(s -> s.toUpperCase())
					.collect(Collectors.toList());
		System.out.println(output2);

	}

}
