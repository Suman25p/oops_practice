package com.collection.hashset;

import java.util.HashSet;

public class CompanyApp {

	public static void main(String[] args) {
		
		HashSet<Employee> employees = new HashSet<>();
		
		employees.add(new Employee(101,"Narender"));
		employees.add(new Employee(102,"Amit"));
		employees.add(new Employee(101,"Vivek"));
		employees.add(new Employee(103,"Chandan"));
		employees.add(new Employee(104,"Sowmyadeep"));
		
		System.out.println("Total Employees: " + employees.size());
	}

}
//Total Employees: 4
