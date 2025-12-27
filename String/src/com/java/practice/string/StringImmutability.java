package com.java.practice.string;

public class StringImmutability {

	public static void main(String[] args) {
		String s1 = "Coding";
		String s2 = s1.concat(" Daily");
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		
		System.out.println("Are s1 and s2 are same?  " + (s1==s2));
	}

}
