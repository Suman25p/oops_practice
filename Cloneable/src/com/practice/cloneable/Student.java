package com.practice.cloneable;

public class Student implements Cloneable{
	
	int id;
	String name;
	
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
		
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Student s1 = new Student(101, "Riya");
		Student s2 = (Student) s1.clone();
		
		System.out.println(s1.id + " " + s1.name); // 101 Riya
		System.out.println(s2.id + " " + s2.name);// 101 Riya
		
		System.out.println(s1.id == s2.id);//true 
		System.out.println(s1.name == s2.name); //true
		
	//	System.out.println((s1.id).equals(s2.id));//Cannot invoke equals(int) on the primitive type int
		
		System.out.println((s1.name).equals(s2.name));//true
		
		System.out.println(s1 == s2); //false
		System.out.println(s1.equals(s2)); //false
	}

}
