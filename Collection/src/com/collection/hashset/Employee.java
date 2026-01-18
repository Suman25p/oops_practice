package com.collection.hashset;

import java.util.Objects;

public class Employee {
	Integer empId;
	String name;
	
	Employee(Integer empId, String name)
	{
		this.empId = empId;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Employee other = (Employee) obj;
		return Objects.equals(this.empId, other.empId);
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(empId);
	}
}
