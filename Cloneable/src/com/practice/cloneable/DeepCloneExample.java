package com.practice.cloneable;

class Address2
{
	String city;
	Address2(String city)
	{
		this.city = city;
	}
}

class Student2 implements Cloneable 
{
	int id;
	String name;
	Address2 address;
	
	Student2(int id, String name, Address2 address)
	{
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student2 copy = (Student2) super.clone();
		copy.address = new Address2(this.address.city); //DEEP COPY
		return copy;
	}
	
}

public class DeepCloneExample {

	public static void main(String[] args) throws Exception {
		
		Address2 addr = new Address2("Kolkata");
		Student2 s1 = new Student2(101, "Rahul", addr);
		
		Student2 s2 = (Student2) s1.clone();
		
		s2.address.city = "Mumbai";
		
		System.out.println(s1.address.city); //Kolkata
		System.out.println(s2.address.city); //Mumbai
		
		//s1 and s2 are completely independent object
		System.out.println(s1 == s2);//false
	}

}
