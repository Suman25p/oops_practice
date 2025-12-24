package com.oops.abstraction;
abstract class Employee
{
	String name;
	int empId;
	
	Employee(String name, int empId)
	{
		this.name = name;
		this.empId = empId;
	}
	
	abstract double calculateSalary();
	
	void displayDetails()
	{
		System.out.println("Name: " + name + ", ID: " + empId);
	}
}

class FullTimeEmployee extends Employee
{
	double monthlySalary;
	FullTimeEmployee(String name, int empId, double salary)
	{
		super(name, empId);
		this.monthlySalary = salary;
	}
	@Override
	double calculateSalary()
	{
		return monthlySalary;
	}
	
}

class ContractEmployee extends Employee
{
	int hoursWorked;
	double ratePerHour;
	
	ContractEmployee(String name, int empId, int hours, double rate) {
		super(name, empId);
		this.hoursWorked = hours;
		this.ratePerHour = rate;
	}
	
	@Override
	double calculateSalary() {
		return hoursWorked * ratePerHour;
	}
}

public class EmployeeDriver {
	
	public static void main(String[] args) {
		
		Employee emp1 = new FullTimeEmployee("Suman", 101 , 70000);
		Employee emp2= new FullTimeEmployee("Mamta",102, 700);
		
		emp1.displayDetails();
		System.out.println("Salary: " + emp1.calculateSalary());
		
		emp2.displayDetails();
		System.out.println("Salary: " + emp2.calculateSalary());
		
	}

}
