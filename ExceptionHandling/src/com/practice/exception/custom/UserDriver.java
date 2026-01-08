package com.practice.exception.custom;

import java.util.HashSet;
import java.util.Set;

class EmailAlreadyExistsException extends Exception
{
	public EmailAlreadyExistsException(String message)
	{
		super(message);
	}
}

class UserService
{
	private static Set<String> emails = new HashSet<>();
	
	public void registerUser(String email) throws EmailAlreadyExistsException{
		if(email.contains(email)) {
			throw new EmailAlreadyExistsException("Email already registered: " + email);
		}
		
		emails.add(email);
		System.out.println("User registered successfully");
	}
}

public class UserDriver {

	public static void main(String[] args) {
		
		UserService service = new UserService();
		try {
			service.registerUser("test@gmail.com");
			service.registerUser("test@gmail.com");
		}catch(EmailAlreadyExistsException e){
			System.out.println("Registration failed: " + e.getMessage());
		}
	}
}
