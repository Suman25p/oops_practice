package com.oops.constructor;

public class Database 
{
	String dbName,user,password;
	
	//Default constructor (calls parameterized constructor)
	Database()
	{
		this("mydb", "root", "admin123");
	}
	
	//Parameterized constructor
	Database(String _dbName, String _user, String _password)
	{
		this.dbName = _dbName;
		this.user = _user;
		this.password = _password;
		connect();
	}
	
	void connect()
	{
		System.out.println("Connecting to DB: " + dbName + " as " + user);
	}
	
	public static void main(String[] args) {
		
		 new Database();//Uses default values
		 new Database("testdb", "admin", "pass123"); //uses custom values

	}

}
