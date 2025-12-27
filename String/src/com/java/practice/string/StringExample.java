package com.java.practice.string;

public class StringExample {

	public static void main(String[] args) {
		String s1 = "Bangalore";
		String s2 = new String("Bangalore");
		System.out.println(s1.equals(s2)); //true, bcz comparing content of both string
		
		System.out.println(s1==s2);//false, bcz comparing address of both string
		
		String s3 = " Kolkata";
		s3.concat("West Bengal"); //no change, bcz not assigned 
		
		String s4 = s3.concat(" West Bengal");
		System.out.println(s3); // Kolkata
		System.out.println(s4); // Kolkata West Bengal
		
		String s5 = s1 + s3; //this use StringBuilder to create new object
		System.out.println(s5); //Bangalore Kolkata
		
		String s6 = "Hello" + " Bangalore" + " Kolkata"; //compile time optimization
		System.out.println(s6); //Hello Bangalore Kolkata , 1 object in SCP

	}

}
