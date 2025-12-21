package com.oops.constructor;
class Employee
{
	String name;
	
	Employee(String _name)
	{
		this.name = _name;
		System.out.println(name + " is an Employee");
	}
}
	
public class Manager extends Employee
{
	String department;
	
	Manager(String _name,String _department)
	{
		super(_name);
		this.department = _department;
		System.out.println(name + " is a Manager of " + department);
	}
	
	public static void main(String[] args) {
		
		new Manager("Rakesh", "IT");

	}

}
