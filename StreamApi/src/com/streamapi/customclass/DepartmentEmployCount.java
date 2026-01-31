package com.streamapi.customclass;
//Find all departments with more than 2 employees
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentEmployCount {

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
		
		List<String> list = employ.stream()
				.collect(Collectors.groupingBy(Employees::getDepartment
						,Collectors.counting()
						))
						.entrySet().stream()
						.filter(e -> e.getValue() > 2)
						.map(Map.Entry::getKey)
						.toList();
		
		System.out.println(list);

	}

}
