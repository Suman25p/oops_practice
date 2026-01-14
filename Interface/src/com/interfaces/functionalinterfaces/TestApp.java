package com.interfaces.functionalinterfaces;

public class TestApp {

	public static void main(String[] args) {
		
		User user = new User("Suman", 23, "suman@gmail.com");
		UserService service = new UserService();
		
		IUserValidator ageValidator = u -> u.age >= 18;
		
		IUserValidator emailValidator = u -> u.email != null && u.email.contains("@");
		
		System.out.println(service.processValidation(user, ageValidator));
		System.out.println(service.processValidation(user, emailValidator));

	}

}

//true
//true
