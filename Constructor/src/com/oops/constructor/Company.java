package com.oops.constructor;
class Employees
{
	String empName;
	String empId;
	int age;
	
	Employees(String _empName, String _empId, int _age)
	{
		this.empName = _empName;
		this.empId = _empId;
		this.age =_age;
		
		System.out.println("-----------Employee Details:--------");
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Id: " + empId);
		System.out.println("Age: " + age);
	}
}

public class Company extends Employees {
	
	String companyName;
	Company(String _empName, String _empId, int _age, String _companyName)
	{
		super(_empName,_empId, _age);
		this.companyName = _companyName;
		System.out.println("Company Name: " + companyName);
	}
	
	public static void main(String[] args) 
	{
		
		new Company("Karan Kumar", "INFO123", 30, "Infosys");

	}

}
