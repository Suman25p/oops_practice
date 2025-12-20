package com.oops.encapsulation;

class Employee
{
	private int empId;
	private double salary;
	
	public int getEmpId()
	{
		return empId;
	}
	
	public void setEmpId(int empId) {
		if(empId > 0) {
			this.empId = empId;
		}
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		if(salary > 0) { 
			this.salary = salary; //salary can not be negative
		}
	}
}

public class EmployeeDriver {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setEmpId(107);
		emp.setSalary(60000);
		
		System.out.println("Employee ID: " + emp.getEmpId());
		System.out.println("Salary : " + emp.getSalary());

	}

}
