package com.java.practice.string;

public class StringImmutable {

	public static void main(String[] args) {
		
		String s1 = "Puri";
		String s2 = s1.concat(" Temple");
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		
		System.out.println(s1 == s2); //false

	}

}

//s1: Puri
//s2: Puri Temple
//false
