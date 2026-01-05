package com.java.practice.string;

public class Concatenation {

	public static void main(String[] args) {
		String s1 = "Heritage";
		String s2 = " Academy";
		
		String result = s1 +s2;
		System.out.println(result);
		
		String output = s1.concat(s2);
		System.out.println(output);
	}

}
/*
Heritage Academy
Heritage Academy
*/