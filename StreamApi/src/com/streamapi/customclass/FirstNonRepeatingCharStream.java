package com.streamapi.customclass;
//Find First Non-Repeating character
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharStream 
{
	public static void main(String[] args) {
		
		String str = "LinkedIn";
		
		Optional<Map.Entry<Character, Long>> first = str.chars()
					.mapToObj(c -> (char) c)
					.collect(Collectors.groupingBy(
							Function.identity(),
							LinkedHashMap::new
							,Collectors.counting()
					)).entrySet()
					.stream()
					.filter(entry -> entry.getValue() == 1)
					.findFirst();
		
		System.out.println(first.get());
	}
}
