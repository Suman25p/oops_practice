package com.practice.cloneable;

class Address
{
	String city;
	
	Address(String city)
	{
		this.city = city;
	}
}

class Students implements Cloneable {
	int id;
	String name;
	Address address;
	
	Students(int id, String name, Address address)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone(); //SHALLOW COPY
	}
	
}
public class ShallowCloneExample {

	public static void main(String[] args) throws Exception 
	{
		Address addr = new Address("Kolkata");
		
		Students s1 = new Students(101, "Suman", addr);
		
		System.out.println(s1.address.city); //Kolkata
		
		Students s2 = (Students) s1.clone();
		
		s2.address.city = "Mumbai";
		
		System.out.println(s1.address.city); //Mumbai
		
		System.out.println(s2.address.city); //Mumbai
		System.out.println(s1== s2);//false
	}

}
