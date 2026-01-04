package com.oops.markerinterface;

//Marker Interface
interface EligibleForExams
{
	
}

class Students implements EligibleForExams
{
	
}

public class ExamSystems
{
	static void check(Object obj) {

        if (obj instanceof EligibleForExam) {
            System.out.println("Allowed to give exam");
        } else {
            System.out.println("Not allowed");
        }
    }

    public static void main(String[] args) {

        Student student = new Student();
        Object outsider = new Object();

        check(student);
        check(outsider);
    }

}
