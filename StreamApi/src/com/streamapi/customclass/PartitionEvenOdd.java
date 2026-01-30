package com.streamapi.customclass;
//Partition numbers in even and odd list
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEvenOdd {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,2,3,4,5,8,10,13);
		
		System.out.println("Given List: " + numbers);
		Map<Boolean, List<Integer>>	output = numbers.stream()
								.collect(Collectors.partitioningBy(n -> n% 2 == 0));
		
		System.out.println("Even Numbers: " + output.get(true));
		
		System.out.println("Odd Numbers: " + output.get(false));

	}

}
