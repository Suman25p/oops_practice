package com.oops.polymorphism;

class Registration
{
	void doRegistration(String aadhar)
	{
		System.out.println("Registered using Aadhar: " + aadhar);
	}
	
	void doRegistration(String mobile, int otp)
	{
		System.out.println("Registered using mobile : " + mobile + " with OTP: " + otp);
	}
	
	void doRegistration(String name, String email)
	{
		System.out.println("Registered using name " + name + " and Email " + email);
	}
	
	void doRegistration(int otp, String mobile)
	{
		System.out.println("Registered using OTP: " + otp + " for mobile " + mobile);
	}
	
}

public class MethodOverloadingExample {

	public static void main(String[] args) {
		
		Registration reg = new Registration();
		reg.doRegistration("1234-5678-9101");
		reg.doRegistration("9987562546", 1234);
		reg.doRegistration(12345, "99898766525");
		reg.doRegistration("Sumsn", "suman25@gmail.com");

	}

}
