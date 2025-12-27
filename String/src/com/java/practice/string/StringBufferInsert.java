package com.java.practice.string;

public class StringBufferInsert {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Welcome to");
		
		System.out.println(sb);
		
		//Use insert() method to insert text at a specific position
		sb.insert(10, " Nandi Hills");
		
		System.out.println(sb);

	}

}
