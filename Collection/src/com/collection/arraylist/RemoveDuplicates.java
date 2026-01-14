package com.collection.arraylist;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(20);
		
		ArrayList<Integer> result = new ArrayList<>(new LinkedHashSet<>(list));
		
		System.out.println(result);

	}

}
