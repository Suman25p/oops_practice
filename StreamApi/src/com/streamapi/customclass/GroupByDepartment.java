package com.streamapi.customclass;
//Group employees by department and calculate average salary
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDepartment {

	public static void main(String[] args) {
		
		List<Employees> employ = Arrays.asList(
				new Employees (1, "Nayandeep", "HR", 50000),
				new Employees (2, "Kapil", "IT", 70000),
				new Employees (3, "Gaurav", "IT", 80000),
				new Employees (4, "Nitesh", "Finanace", 60000),
				new Employees (5, "Rahul", "HR", 65000)
				);
		
		Map<String,Double> output = employ.stream()
					.collect(Collectors.groupingBy(Employees::getDepartment, 
							Collectors.averagingDouble(Employees::getSalary)));
		
		System.out.println(output);

	}

}
