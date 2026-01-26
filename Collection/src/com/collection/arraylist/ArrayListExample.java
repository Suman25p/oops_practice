package com.collection.arraylist;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Rupa");
		name.add("Kanchan");
		name.add("Sweta");
		name.add("Avishek");
		name.add("Naren");
		name.add("Rupa");
		name.add("Kanchan");
		name.add("Sweta");
		name.add("Avishek");
		name.add("Naren");
		name.add("Sunita");
		name.add(null);
		name.add(null);
		System.out.println(name);
		System.out.println(name.size());
	}

}
