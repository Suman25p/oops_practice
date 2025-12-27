package com.java.practice.string;

public class StringIntern {

	public static void main(String[] args) {
		
		String s1 = "College";
		String s2 = new String("College");
		
		System.out.println(s1 == s2);//false
		s2 = s2.intern(); //interning, copy the object from heap to SCP
		
		System.out.println(s1 == s2);//true, 

	}

}
