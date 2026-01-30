package com.practice.streamapi;
//Find first non-empty string
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NonEmptyString {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList(" " ," ", "Hello", "Bangalore");
		
		System.out.println("Input Strings: " + strings);
		
		Optional<String> first = strings.stream()
								.filter(s -> !s.isBlank())
								.findFirst();
		
		System.out.println("Result: " + first.get());

	}

}
