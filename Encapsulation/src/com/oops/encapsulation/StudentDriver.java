package com.oops.encapsulation;

class Student
{
	private String name;
	private int marks;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		if(name != null && !name.isEmpty()) 
		{
			this.name = name;
		}
	}
	
	public int getMarks()
	{
		return marks;
	}
	
	public void setMarks(int marks)
	{
		if(marks >= 0 && marks <= 100) {
			this.marks = marks;
		}
	}
}

public class StudentDriver {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setName("Sushmita");
		student.setMarks(85);
		
		System.out.println("Student's Name: " + student.getName());
		System.out.println("Marks: " + student.getMarks());

	}

}
