package com.java.practice.string;

public class MaskSensitiveData {

	public static void main(String[] args) {
		StringBuffer phone = new StringBuffer("9847382910");
		
		phone.replace(0,8, "*********");
		
		System.out.println("Masked Phone Number: " + phone);
		
	}

}
