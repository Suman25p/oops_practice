package com.practice.exception;

public class Student {
	String name;
	
	Student(String name) throws Exception
	{
		if(name == null) {
			throw new Exception("Name can not be null");
		}
		this.name = name;
		System.out.println("Student Created: " + name);
		
	}
	public static void main(String[] args) 
	{
		try {
			Student s = new Student(null);
			
		}catch(Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	}

}
