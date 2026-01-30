package com.streamapi.customclass;
//Group a list of words by their length using Stream
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple", "ball", "cat", "dog", "egg", "fish", "mango");
		
		System.out.println("Input Words: " + words);
		
		Map<Integer, List<String>> output = words.stream()
								.collect(Collectors.groupingBy(String::length));
		
		System.out.println(output);

	}

}
