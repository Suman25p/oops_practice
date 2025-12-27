package com.java.practice.string;

public class DynamicQueryBuilder {

	public static void main(String[] args) {
		String department = "CSE";
		Integer salary = 50000;
		String joiningDate = "2020-01-02";
		
		StringBuilder query = new StringBuilder("SELECT * FROM employees WHERE 1=1");
		
		if(department != null && !department.isEmpty())
		{
			query.append("AND department = '").append(department).append("' ");
		}
		
		if(salary != null && salary > 0)
		{
			query.append("AND salry > ").append(salary).append(" ");
			
		}
		if(joiningDate != null && !joiningDate.isEmpty()) {
			query.append("AND joining_date >= '").append("' ");
		}
		System.out.println("Final Query: " + query.toString());

	}

}
