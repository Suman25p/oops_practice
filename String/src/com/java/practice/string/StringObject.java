package com.java.practice.string;

public class StringObject {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = new String("Java");
		
		String s3 = s2.intern();
		String s4 = "Java";
		
		String s5 = new String("Hibernate");
		String s6 = new String("Hibernate").intern();
		System.out.println(s1 == s2); //false
		System.out.println(s1 == s3); //true
		System.out.println(s3 == s4); //true
		System.out.println(s5 == "Hibernate"); //false
		System.out.println(s6 == "Hibernate"); //true
		
		System.out.println("-------------------------");
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s4));//true
		System.out.println(s1.equals(s5)); //false
		System.out.println(s3.equals(s4)); //true
		System.out.println(s5.equals(s6));//true
		
	}

}
