package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListAllOperation {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Laptop");
		list.add("Mobile");
		list.add("Headphone");
		list.add("Tablet");
		
		System.out.println("Initial list: " + list);
		
		list.add(1, "Smart Watch");
		System.out.println("\nAfter add(index, element): " + list);
		
		System.out.println("\nElement at index 2: " + list.get(2));
		
		list.set(2,  "Camera");
		System.out.println("\nAfter set(): " + list);
		
		list.remove(3);
		System.out.println("\nAfter remove(index): " + list);
		
		list.remove("Tablet");
		System.out.println("After remove: " + list);
		
		System.out.println("\nContains Laptop? " + list.contains("Laptop"));
		
		System.out.println("Index of Mobile: " + list.indexOf("Mobile"));
		
		System.out.println("Size: " + list.size() );
		
		System.out.println("\nUsing for-loop");
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("\nUsing enhanced for-loop:");
		for(String item: list)
		{
			System.out.println(item);
		}
		
		System.out.println("\nUsing Iterator:");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(list);
		System.out.println("After sorting: " + list);
		
		System.out.println("Is List empty? " + list.isEmpty());
		
		list.clear();
		System.out.println("After clear():" + list);
		
		System.out.println("Size after clear: " + list.size());

	}

}
