package com.java.practice.string;

import java.util.Random;

public class OTPGenerator {

	public static void main(String[] args) {
		
		StringBuffer otp = new StringBuffer();
		
		Random r = new Random();
		
		for(int i=0 ; i< 8; i++)
		{
			otp.append(r.nextInt(10));
		}
		
		System.out.println("OTP Generated: " + otp);
	}

}
