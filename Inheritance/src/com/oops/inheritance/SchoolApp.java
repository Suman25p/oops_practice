package com.oops.inheritance;
class Person
{
	String name;
	int age;
	
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	void introduce() {
		System.out.println("My name is  " + name + " and I am " + age + " years old.");
	}
}

class Student extends Person
{
	String course;
	
	Student(String name, int age, String course)
	{
		super(name, age);
		this.course = course;
	}
	void study()
	{
		System.out.println(name + " is studying " + course);
	}
}

class Teacher extends Person
{
	String subject;
	
	Teacher(String name, int age, String subject){
		super(name, age);
		this.subject = subject;
	}
	
	void teach() {
		System.out.println(name + " is teaching " + subject);
	}
}

public class SchoolApp {
	public static void main(String[] args) {
		Student student = new Student("Payal", 22, "Computer Science");
		student.introduce();
		student.study();
		
		System.out.println("--------------");
		
		Teacher teacher = new Teacher("Rohit", 35, "Java");
		teacher.introduce();
		teacher.teach();
		
		
	}
}
