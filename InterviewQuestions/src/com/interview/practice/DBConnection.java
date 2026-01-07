package com.interview.practice;

public class DBConnection {
	private static DBConnection instance;
	
	private DBConnection() {
		System.out.println("DB Connection Created");
	}
	
	public static DBConnection getInstance()
	{
		if(instance == null) {
			instance = new DBConnection();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		
		DBConnection db1 = DBConnection.getInstance();
		DBConnection db2 = DBConnection.getInstance();
		
		System.out.println(db1==db2); //true
		System.out.println(db1.equals(db2)); //true
	}

}
