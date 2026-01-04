package com.oops.markerinterface;

//marker interface
interface EligibleForExam
{
	
}

class Student implements EligibleForExam
{
	String name = "Riya";
}

class ExamSystem {
	static void check(Object obj)
	{
		if(obj instanceof EligibleForExam) 
		{
			System.out.println("Allowed to give exam");
		}else
		{
			System.out.println("Not allowed");
		}
	}
}


public class MarkerInterfaceExample {

	public static void main(String[] args) {

        Student student = new Student();   // Eligible
        Object outsider = new Object();    // Not Eligible

        System.out.println("Checking Student:");
        ExamSystem.check(student);

        System.out.println("\nChecking Outsider:");
        ExamSystem.check(outsider);
    }
}
