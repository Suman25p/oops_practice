package com.java.practice.string;

public class StringCapacity {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		int capacity = sb.capacity();
		System.out.println("Initial capacity of String Buffer is: " + capacity); //16
		
		sb.append("Welcome to Zumangi Game!!!");
		
		System.out.println(sb.capacity()); //34 (capacity * 2) + 2
		
		sb.append("Lets start game");
		
		System.out.println(sb.capacity()); //70 (34 * 2) + 2 = 70

	}

}
