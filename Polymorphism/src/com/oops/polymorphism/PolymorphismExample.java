package com.oops.polymorphism;
class Person
{
	void showRole()
	{
		System.out.println("I am a person with multiple roles");
	}
}

class Student extends Person
{
	@Override
	void showRole()
	{
		System.out.println("I am a Student. I study and attend classes");
	}
}

class Manager extends Person
{
	@Override
	void showRole()
	{
		System.out.println("I am Manager . I manage a team");
	}
}

public class PolymorphismExample
{
	public static void main(String[] args) 
	{
		Person person;
		
		person = new Student();
		person.showRole();
		
		person = new Manager();
		person.showRole();
	}
}
