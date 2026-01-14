package com.interfaces.functionalinterfaces;

public class UserService
{
	boolean processValidation(User user, IUserValidator validator)
	{
		return validator.validate(user);
	}
}
