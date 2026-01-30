package com.practice.streamapi;
//Find duplicate numbers from list
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,12,7,7,182,90);
		
		System.out.println("Input List: " + list);
		
		Set<Integer> noDup = new HashSet<>();
		
		List<Integer> duplicate = list.stream()
				.filter(l -> !noDup.add(l)).toList();
		
		System.out.println("Duplicate Numbers: " + duplicate);
	}

}
