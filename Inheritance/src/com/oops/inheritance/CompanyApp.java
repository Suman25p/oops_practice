package com.oops.inheritance;
class Employees
{
	protected int empId;
	protected String name;
	protected double salary;
	
	public Employees(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public void diplayEmployee() {
		System.out.println("Employee ID :" + empId);
		System.out.println("Name        :" + name);
		System.out.println("Salary      :" + salary);
	}
}

class SoftwareEngineer extends Employee {
	protected String technology;
	
	public SoftwareEngineer(int empId, String name, double salary, String technology)
	{
		super(empId,name,salary);
		this.technology = technology;
	}
	
	public void writeCode() {
		System.out.println(name + " is coding in " + technology);
	}
}

class SeniorSoftwareEngineer extends SoftwareEngineer 
{
	private int experience;
	public SeniorSoftwareEngineer(int empId, String name, double salary, String technology, int experience)
	{
		super(empId, name, salary,technology);
		this.experience = experience;
	}
	
	public void mentorTeam()
	{
		System.out.println(name + " is mentoring team with " + experience + " years experience");
	}	
}

public class CompanyApp {

	public static void main(String[] args) {
		
		SeniorSoftwareEngineer senior = new SeniorSoftwareEngineer(101, "Rupali Chaudhary", 90000, "Java", 7);
		
		senior.displayDetails();
		senior.writeCode();
		senior.mentorTeam();

	}

}
