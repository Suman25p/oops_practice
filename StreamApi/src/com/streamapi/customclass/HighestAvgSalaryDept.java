package com.streamapi.customclass;
//Find department with the highest average salary
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestAvgSalaryDept {

	public static void main(String[] args) {
		List<Employees> employ = Arrays.asList(
				new Employees (1, "Nayandeep", "HR", 50000),
				new Employees (2, "Kapil", "IT", 70000),
				new Employees (3, "Chandan", "IT", 80000),
				new Employees (4, "Nitesh", "Finanace", 60000),
				new Employees (5, "Rahul", "HR", 65000),
				new Employees (6, "Nayana", "HR", 55000),
				new Employees (7, "Souvik", "IT", 75000),
				new Employees (9, "Aryan", "Finanace", 60000),
				new Employees (8, "Nitesh", "Finanace", 60000),
				new Employees (4, "Gaurav", "Operations", 50000)
				);
		
		Map.Entry<String, Double> stringDoubleEntry = employ.stream()
					.collect(Collectors.groupingBy(
							Employees::getDepartment,
							Collectors.averagingDouble(Employees::getSalary)
							)).entrySet().stream()
							.max(Map.Entry.comparingByValue())
							.orElseThrow();
		
		System.out.println(stringDoubleEntry);

	}

}
