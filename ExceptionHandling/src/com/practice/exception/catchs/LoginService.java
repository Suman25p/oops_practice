package com.practice.exception.catchs;

public class LoginService {

	public static void main(String[] args) {
		
		try {
			String user = null;
			System.out.println(user.length());
			
			int otp = Integer.parseInt("ABC"); //NumberFormatException 
		}
		catch(NullPointerException | NumberFormatException e)
		{
			System.out.println("Invalid user input");
		}

	}

}
