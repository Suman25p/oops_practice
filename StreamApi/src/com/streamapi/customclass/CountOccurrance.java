package com.streamapi.customclass;
//Count occurances of each element in a list
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrance {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("apple","mango","apple","orange","banana","mango");
		
		System.out.println("Input: " + fruits);
		
		Map<String, Long> map = fruits.stream()
								.collect(Collectors.groupingBy(Function.identity(),
								Collectors.counting()));
		
		System.out.println("Result: " + map);

	}

}
