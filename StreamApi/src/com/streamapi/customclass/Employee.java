package com.streamapi.customclass;

public class Employee {

	private int id;
	private String name;
	private double salary;
	
	public Employee(int _id, String _name, double _salary)
	{
		this.id =_id;
		this.name = _name;
		this.salary = _salary;
	}
	
	public int getId() { return id;}
	
	public String getName() { return name;}
	
	public double getSalary() { return salary;}
	
	@Override
	public String toString() { return id + " -> " + name + "-> " + salary; }
	
}
