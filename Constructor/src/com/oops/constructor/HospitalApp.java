package com.oops.constructor;

class Person
{
	String name;
	int age;
	
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
		
		if(age <= 0)
		{
			System.out.println("Invalid age");
		}
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Perosn verified");
	}
}

class Patient extends Person {
	boolean admitted;
	
	Patient(String name, int age, boolean admitted) 
	{
		super(name, age);
		this.admitted = admitted;
		
		if(!admitted) {
			System.out.println("Patient not admitted");
		}
	}
}

class InsurancePatient extends Patient {
	double insuranceLimit;
	double billAmount;
	
	InsurancePatient(String name, int age, boolean admitted, double insuranceLimit, double billAmount)
	{
		super(name, age, admitted);
		this.insuranceLimit = insuranceLimit;
		this.billAmount = billAmount;
		if(billAmount > insuranceLimit)
		{
			System.out.println("Insurance Limit exceeded");
		}
		
		System.out.println("Insurance approved");
	}
}

public class HospitalApp {

	public static void main(String[] args) {
		
		new InsurancePatient("Suraj", 25, true, 100000, 75000);

	}

}
