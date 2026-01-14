package com.collection.arraylist;

import java.util.ArrayList;

public class SecondHighest {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(50);
		list.add(40);
		list.add(20);
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int num: list) {
			if(num > max) {
				secondMax = max;
				max = num;
			}else if(num > secondMax && num != max) {
				secondMax = num;
			}
		}
		
		System.out.println("Second Highest : " + secondMax);
	}

}
