package com.practice.exception;

class InvalidSalaryException extends Exception
{
	InvalidSalaryException(String msg){
		super(msg);
	}
}

public class Employee {
	static void checkSalary(int salary) throws InvalidSalaryException 
	{
		if(salary < 100000) {
			throw new InvalidSalaryException("Salary too low");
		}
	}
	
	public static void main(String[] args) throws InvalidSalaryException {
		
		checkSalary(8000);
	}

}
