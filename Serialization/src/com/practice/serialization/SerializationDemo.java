package com.practice.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	int id;
	String name;
	
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
}

public class SerializationDemo {

	public static void main(String[] args) throws Exception {
		
		//Serialization
		Student s = new Student(101, "Priyam");
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.txt"));
		out.writeObject(s);
		out.close();
		
		//Deserialization
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.txt"));
		
		Student obj = (Student)in.readObject();
		in.close();
		
		System.out.println(obj.id + " " + obj.name);
	}

}
