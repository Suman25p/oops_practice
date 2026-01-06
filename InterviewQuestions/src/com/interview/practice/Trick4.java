package com.interview.practice;

public class Trick4 {

	public static void main(String[] args) {
		Boolean b1 = true;
		Boolean b2 = true;
		
		Boolean b3 = new Boolean(true);
		
		System.out.println(b1 == b2);//true
	    System.out.println(b1 == b3);//false

	}

}
