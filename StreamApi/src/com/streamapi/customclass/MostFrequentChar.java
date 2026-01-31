package com.streamapi.customclass;
//Find Most Frequent Characters in String
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentChar {

	public static void main(String[] args) {
		
		String input = "banana";
		
		//"banana" -> ['b', 'a', 'n', 'a', 'n', 'a']
		
		Map.Entry<Character, Long> charLongEntry = input.chars()
					.mapToObj(c -> (char) c)
					.collect(Collectors.groupingBy(
							Function.identity(),
							Collectors.counting()
							)).entrySet().stream()
							.max(Map.Entry.comparingByValue())
							.orElseThrow();
		
		System.out.println(charLongEntry);

	}

}
