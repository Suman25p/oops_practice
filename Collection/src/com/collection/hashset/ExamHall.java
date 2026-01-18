package com.collection.hashset;

import java.util.HashSet;

public class ExamHall {

	public static void main(String[] args) {
		
		HashSet<Integer> rollNumbers = new HashSet<>();
		
		rollNumbers.add(101);
		rollNumbers.add(102);
		rollNumbers.add(103);
		rollNumbers.add(101);
		rollNumbers.add(104);
		rollNumbers.add(102);
		
		System.out.println("Unique Roll Numbers: " + rollNumbers);
		
		if(rollNumbers.contains(103)) {
			System.out.println("Roll number 103 is present");
		}
		
		rollNumbers.remove(102);
		
		System.out.println("After removal: " + rollNumbers);
	}

}
