package com.streamapi.customclass;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String _name, int _age)
	{
		this.name = _name;
		this.age = _age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName()
	{
		return name;
	}
	
	@Override
	public String toString()
	{
		return name + " ( " + age + " )";
	}

}
