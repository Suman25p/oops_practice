package com.practice.exception.custom;

class DatabaseException extends Exception
{
	DatabaseException(String msg, Throwable cause) {
		super(msg,cause);
	}
}

class UserRepository {
	void saveUser() throws Exception {
		throw new Exception("SQL constraint violation");
	}
}

class UserServices
{
	void registerUser() throws DatabaseException {
		try {
			new UserRepository().saveUser();
		}catch(Exception e)
		{
			throw new DatabaseException("User registration failed", e); //wrapping & rethrowing
		}
	}
}

public class App {

	public static void main(String[] args) {
		try {
			new UserServices().registerUser();
		}catch(DatabaseException e) {
			System.out.println(e.getMessage());
		}

	}

}
