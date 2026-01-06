package com.interview.practice;

public class Trick2 {

	public static void main(String[] args) {
		Integer a = 128;
		int b = 128;
		
		System.out.println(a==b); //true
		System.out.println(a.equals(b)); //true
		
//		🧠 Explanation
//
//		a auto-unboxed to int
//
//		Primitive vs primitive → value comparison
		
	}

}
