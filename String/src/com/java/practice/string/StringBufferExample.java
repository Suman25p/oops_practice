package com.java.practice.string;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Heritage Institute");
		
		sb.append(",Kolkata");
		sb.append(", West Bengal");
		System.out.println(sb);
		
		System.out.println("Capacity: " + sb.capacity());
		
	}

}
