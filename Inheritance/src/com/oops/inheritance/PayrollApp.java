package com.oops.inheritance;
class Employee
{
	protected int empId;
	protected String name;
	protected double baseSalary;
	
	public Employee(int empId, String name, double baseSalary) {
		this.empId = empId;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	public double calculateSalary() {
		return baseSalary;
	}
	
	public void displayDetails() {
		System.out.println("ID: " + empId);
		System.out.println("Name: " + name);
		System.out.println("Base Salary: " + baseSalary);
	}
}

class ParmanentEmployee extends Employee
{
	private static final double PF_RATE = 0.12;
	private static final double HRA_RATE = 0.20;
	
	public ParmanentEmployee(int empId, String name, double baseSalary) {
		super(empId, name, baseSalary);
		
	}
	
	@Override
	public double calculateSalary() {
		double pf = baseSalary * PF_RATE;
		double hra = baseSalary * HRA_RATE;
		return baseSalary + hra - pf;
	}
}

class ContractEmployee extends Employee
{
	private double contractBonus;
	
	public ContractEmployee(int empId, String name, double baseSalary, double contractBonus)
	{
		super(empId, name, baseSalary);
		this.contractBonus = contractBonus;
	}
	
	@Override
	public double calculateSalary() {
		return baseSalary + contractBonus;
	}
}

class Intern extends Employee
{
	public Intern(int empId, String name, double stipend) {
		super(empId, name, stipend);
	}
	@Override
	public double calculateSalary()
	{
		return baseSalary;
	}
}

public class PayrollApp {
	
	public static void generatePayslip(Employee emp)
	{
		emp.displayDetails();
		System.out.println("Final Salary: " + emp.calculateSalary());
		System.out.println("-----------------------------");
	}
	
	public static void main(String[] args) {
		
		Employee emp1 = new ParmanentEmployee(101, "Suman", 40000);
		Employee emp2 = new ContractEmployee(102, "Amit", 30000, 5000);
		Employee emp3 = new Intern(103, "Rupa",15000);
		
		generatePayslip(emp1);
		generatePayslip(emp2);
		generatePayslip(emp3);
	}

}
