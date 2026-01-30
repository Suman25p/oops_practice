package com.streamapi.customclass;
//Calculate the average age of a list of Person objects objects
import java.util.Arrays;
import java.util.List;

public class AverageAgeExample {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
					new Person("Sunita", 40),
					new Person("Rakesh", 22),
					new Person("Avishek", 20),
					new Person("Karan", 18)
				);
		System.out.println(people);
		
		double avg = people.stream()
				.mapToInt(Person::getAge)
				.average()
				.orElse(0.0);
		
		System.out.println("Average: " + avg);
		

	}

}
