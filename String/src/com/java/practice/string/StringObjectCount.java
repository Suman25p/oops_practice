package com.java.practice.string;

public class StringObjectCount {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = new String("Java");
		
	
		String str3 = str2.intern();
		String str4 = "Java";
		String str5 = new String("JavaScript").intern();
		
		System.out.println(str1 == str2);//false
		System.out.println(str2 == str3);//false
		System.out.println(str1 == str3);//true
		System.out.println(str3 == str4);//true
		System.out.println(str3 ==str5);//false
		
		System.out.println(str5 == "JavaScript");//true
		
	}

}
