package com.oops.inheritance;

class Course
{
	int courseId;
	String courseName;
	double baseFee;
	
	public Course(int courseId, String courseName, double baseFee)
	{
		this.courseId = courseId;
		this.courseName = courseName;
		this.baseFee = baseFee;
	}
	
	public double calculateFee()
	{
		return baseFee;
	}
	
	public void displayCourse()
	{
		System.out.println("Course ID : " + courseId);
		System.out.println("Course Name: " + courseName);
		System.out.println("Base Fee: " + baseFee);
	}
}

class RecordedCourse extends Course
{
	private double discount;
	
	public RecordedCourse(int courseId, String courseName, double baseFee, double discount)
	{
		super(courseId, courseName, baseFee);
		this.discount = discount;
		
	}
	
	@Override
	public double calculateFee()
	{
		return baseFee - discount;
	}
}

class LiveCourse extends Course
{
	private double liveSessionFee;
	
	public LiveCourse(int courseId, String courseName, double baseFee, double liveSessionFee)
	{
		super(courseId, courseName, baseFee);
		this.liveSessionFee = liveSessionFee;
	}
	
	@Override
	public double calculateFee() {
		return baseFee + liveSessionFee;
	}
}

class PremiumCourse extends Course
{
	private double mentorFee;
	private double certificationFee;
	
	public PremiumCourse(int courseId,String courseName, double baseFee, double mentorFee, double certificationFee)
	{
		super(courseId, courseName, baseFee);
		this.mentorFee = mentorFee;
		this.certificationFee = certificationFee;
	}
	
	@Override
	public double calculateFee() {
		return baseFee + mentorFee + certificationFee;
	}
}

public class OnlineCourseApp {

	public static void main(String[] args) {
		
		Course course1 = new RecordedCourse(101, "Java Basics", 5000, 1000);
		
		Course course2 = new LiveCourse(102, "Spring Boot Live", 8000, 2000);
		
		Course course3 = new PremiumCourse(103, "Full Stack Java",12000, 3000, 1500);
		
		printBill(course1);
		printBill(course2);
		printBill(course3);
	}
	public static void printBill(Course course)
	{
		course.displayCourse();
		System.out.println("Final fee: " + course.calculateFee());
		System.out.println("---------------------------------");
	}

}
