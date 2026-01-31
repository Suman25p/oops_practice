package com.streamapi.customclass;
//Find the highest paid employee in each department
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestPaidByDept {

	public static void main(String[] args) {
		
		List<Employees> employ = Arrays.asList(
				new Employees (1, "Nayandeep", "HR", 50000),
				new Employees (2, "Kapil", "IT", 70000),
				new Employees (3, "Gaurav", "IT", 80000),
				new Employees (4, "Nitesh", "Finanace", 60000),
				new Employees (5, "Rahul", "HR", 65000)
				);
		
		Map<String, Optional<Employees>> result = employ.stream()
					.collect(Collectors.groupingBy(
							Employees:: getDepartment,
							Collectors.maxBy(Comparator.comparing(Employees::getSalary))
					));
		
		System.out.println(result);
	}

}
