package com.java.practice.string;

class Person
{
	String name;
	
	Person(String _name)
	{
		this.name= _name;
	}
}

public class Driver {

	public static void main(String[] args) {
		
		Person p1 = new Person("Amit");
		Person p2 = new Person("Amit");
		
		System.out.println(p1.equals(p2)); //false
		System.out.println(p1 == p2); // false
		
		String s1 = new String("Bangalore");
		String s2 = new String("Bangalore");
		
		System.out.println(s1 == s2); //false
		System.out.println(s1.equals(s2)); //true
		
		String s3 = "Kolkata";
		String s4 = "Kolkata";
		System.out.println(s3==s4);//true
		System.out.println(s3.equals(s4)); //true
		
		System.out.println(s1==s3); //false
		//System.out.println(p1== s1); //Incompatible operand types Person and String

	}

}
