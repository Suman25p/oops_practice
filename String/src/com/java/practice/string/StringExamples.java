package com.java.practice.string;

public class StringExamples {

	public static void main(String[] args) {
		
		String s1 = "Switzerland";
		String s2 = "Switzerland";
		
		String s3 = new String("Switzerland");
		String s4 = new String("Switzerland");
		
		System.out.println(s1==s2);//true
		System.out.println(s1==s3); //false
		System.out.println(s3==s4); //false
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals(s4)); //true
		System.out.println(s3.equals(s4)); //true
		

	}

}
