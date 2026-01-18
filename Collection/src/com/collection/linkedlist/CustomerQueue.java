package com.collection.linkedlist;

import java.util.LinkedList;

public class CustomerQueue {

	public static void main(String[] args) {
		
		LinkedList<Integer> tokenQueue = new LinkedList<>();
		
		tokenQueue.add(101);
		tokenQueue.add(102);
		tokenQueue.add(103); 
		
		tokenQueue.addFirst(100);
		
		System.out.println("Waiting Queue: " + tokenQueue);
		
		Integer servedCustomer = tokenQueue.removeFirst();
		System.out.println("Served Token: " + servedCustomer);
		
		System.out.println("Updated Queue: " + tokenQueue);
		
		tokenQueue.addLast(104);
		
		System.out.println("Final Queue: " + tokenQueue);
	}

}
