package com.oops.polymorphism;

class Employees
{
	void role() {
		System.out.println("Employee Hired!");
	}
}

class Developer extends Employees
{
	void role()
	{
		System.out.println("Developer hired..");
	}
}

class HR
{
	Employees hire()
	{
		return new Employees();
	}
}

class ITCompany extends HR
{
	Developer hire()
	{
		return new Developer();
	}
}

public class CovarientDriver {
	public static void main(String[] args) 
	{
		HR hr = new HR();
		Employees employee = hr.hire();
		employee.role();
		
		System.out.println("----------------------");
		
		ITCompany it = new ITCompany();
		Employees developer = it.hire();
		developer.role();
	}
}
