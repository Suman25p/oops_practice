package com.practice.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int empId;
	String empName;
	transient String password; //will not be serialized
	
	Employee(int _empId, String _empName, String _password)
	{
		this.empId = _empId;
		this.empName = _empName;
		this.password = _password;
	}
}

public class EmployeeSerialization {

	public static void main(String[] args) throws Exception{
		
		Employee e1 = new Employee(101, "Suman", "secret123");
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.ser"));
		out.writeObject(e1);
		out.close();
		
		//Deserialization
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.ser"));
		Employee e2 = (Employee) in.readObject();
		in.close();
		
		//output
		System.out.println("ID: " + e2.empId);
		System.out.println("Name: " + e2.empName);
		System.out.println("Password: " + e2.password); //null

	}

}
