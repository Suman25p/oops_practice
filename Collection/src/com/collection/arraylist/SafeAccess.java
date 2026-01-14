package com.collection.arraylist;

import java.util.ArrayList;

public class SafeAccess {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Dipaali");
		names.add("Suman");
		try {
		System.out.println(names.get(3));
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Invalid index access!");
		}
	}

}
