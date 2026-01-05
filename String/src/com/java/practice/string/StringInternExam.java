package com.java.practice.string;

public class StringInternExam {

	public static void main(String[] args) {
		
		String s1 = "Ujjain Temple";
		String s2 = new String("Ujjain Temple");
		
		System.out.println(s1==s2); //false
		
		String s3 = s2.intern();
		
		System.out.println(s2== s3); //false
		System.out.println(s1==s3); //true
	}

}
