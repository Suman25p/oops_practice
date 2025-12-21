package com.oops.constructor;

class Students
{
	int age;
	
	Students(int age)
	{
		this.age = age;
		System.out.println("Student age: " + age);
	}
}

class Admission extends Students
{
	boolean approved;
	
	Admission(int age, boolean approved)
	{
		super(age);
		this.approved = approved;
		System.out.println("Admission approved: " + approved);
	}
}

class Fee extends Admission
{
	double amount;
	int standard;
	Fee(int age,boolean approved, int standard)
	{
		super(age, approved);
		this.standard = standard;
		if(approved)
		{
			this.amount = standard <= 5 ? 20000 : 35000;
			System.out.println("Fee calculated: " + amount);
		}
	}
}

public class SchoolApp {

	public static void main(String[] args) {
		
		new Fee(8, true, 3);

	}

}
