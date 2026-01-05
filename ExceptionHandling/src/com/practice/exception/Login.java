package com.practice.exception;

public class Login {
	static void login(String password)
	{
		if(!password.equals("admin123"))
		{
			throw new RuntimeException("Invalid Password");
		}
		System.out.println("Login Successful");
	}
	
	public static void main(String[] args) {
		login("user123");
	}

}
