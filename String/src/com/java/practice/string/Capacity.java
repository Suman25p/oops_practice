package com.java.practice.string;

public class Capacity {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		int capacity = sb.capacity();
		
		System.out.println("Initial Capacity of StringBuffer is : " + capacity);
		
		sb.append("Welcome in LinkedIn family!!");
		
		System.out.println("Capacity after first append: " + sb.capacity());
		
		sb.append("I am doing daily coding and updating");
		
		System.out.println("Final Capacity after append: " + sb.capacity());
		
		sb.append("Hello Suman");
		System.out.println("Capacity: " + sb.capacity());
	}

}
//Size = (Capacity * 2) + 2

//Initial Capacity of StringBuffer is : 16
//Capacity after first append: 34
//Final Capacity after append: 70
//Capacity: 142
