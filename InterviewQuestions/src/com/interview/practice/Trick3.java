package com.interview.practice;

public class Trick3 {

	public static void main(String[] args) {
		
		Integer a = null;
		Integer b = 100;
		
		System.out.println(a==b); //false
		System.out.println(b.equals(a));//false -->safe
        System.out.println(a.equals(b));//NullPointerException --> calling method on null

	}

}
