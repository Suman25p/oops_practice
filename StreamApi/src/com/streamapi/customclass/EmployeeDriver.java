package com.streamapi.customclass;
//Sort List Of Employees By Salary
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
				new Employee(101 ," Sonam ", 67000),
				new Employee(102 ," Rounak ", 65000),
				new Employee(105 ," Deepak ", 70000),
				new Employee(108 ," Rahul ", 50000)
				);
		
		List<Employee> assendingList  = employees.stream()
				.sorted(Comparator.comparing(Employee:: getSalary))
				.toList();
		
		System.out.println("Employee List based on Salary in assending : \n" + assendingList);
		
		List<Employee> descendingList = employees.stream()
									.sorted(Comparator.comparing(Employee:: getSalary).reversed())
									.collect(Collectors.toList());
		
		System.out.println("Salary in descending order: \n" + descendingList);			
	}
}
