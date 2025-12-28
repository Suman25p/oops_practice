package com.oops.polymorphism;

class Employee extends Object
{
	protected String name;
	
	public Employee(String _name)
	{
		this.name = _name;
	}
}

class EmployeeName extends Employee
{
	EmployeeName(String name)
	{
		super(name);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Employee e4 = (Employee) obj;
		return this.name.equals(e4.name);
	}
}

public class StringEqualsOverride {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Puja");
		Employee e2 = new Employee("Puja");
		
		System.out.println(e1.equals(e2));  //false
		
		EmployeeName e3 = new EmployeeName("Narender");
		EmployeeName e4 = new EmployeeName("Narender");
		
		System.out.println(e3.equals(e4));  //true
		
	}

}
