package com.java.practice.string;

public class StringBuilderExam {

	public static void main(String[] args)
	{
		StringBuilder query = new StringBuilder("SELECT * FROM Employees WHERE 1=1");
		
		boolean filterByDepartment = true;
		
		if(filterByDepartment)
		{
			query.append("AND department = 'IT'");
		}
		
		boolean filterBySalary = true;
		
		if(filterByDepartment)
		{
			query.append(" AND salary > 500000");
		}
		System.out.println(query.toString());
	}

}

//SELECT * FROM Employees WHERE 1=1AND department = 'IT' AND salary > 500000
