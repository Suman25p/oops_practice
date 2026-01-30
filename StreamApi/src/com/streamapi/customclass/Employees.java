package com.streamapi.customclass;

public class Employees {

	private int id;
	private String name;
	private String department;
	private double salary;
	
	public Employees(int _id, String _name, String _department, double _salary)
	{
		this.id = _id;
		this.name = _name;
		this.department = _department;
		this.salary = _salary;
	}
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString()
	{
		return department + " = " + salary;
	}
	
	
	
}
