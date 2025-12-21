package com.oops.constructor;
class Student
{
	String name;
	int age;
	
	Student(String _name, int _age)
	{
		this.name = _name;
		this.age = _age;
	}
	
	public void display()
	{
		System.out.println("Student Details-----");
		System.out.println("Name : " + name);
		System.out.println("Age: " + age);
	}
}

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student("Suman" , 25);
		student.display();

	}

}
