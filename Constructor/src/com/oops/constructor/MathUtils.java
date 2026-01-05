package com.oops.constructor;

public class MathUtils {
	
	//private constructor
	private MathUtils() {
		System.out.println("Constructor not accessible");
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		System.out.println(MathUtils.add(100, 20));

	}

}
