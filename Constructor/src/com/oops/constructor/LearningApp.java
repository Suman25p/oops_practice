package com.oops.constructor;

class PlatformUser 
{
	boolean active;
	
	PlatformUser(boolean active)
	{
		this.active = active;
		
		if(!active) {
			System.out.println("User Inactive");
		}
		
		System.out.println("User Active");
	}
}

class Course extends PlatformUser 
{
	boolean paymentDone;
	
	Course(boolean active, boolean paymentDone) {
		super(active);
		this.paymentDone = paymentDone;
		if(!paymentDone) {
			System.out.println("Payment pending");
		}
		System.out.println("Course enrolled");
	}
}

class Certificate extends Course {
	boolean completed;
	
	Certificate(boolean active, boolean paymentDone, boolean completed)
	{
		super(active, paymentDone);
		this.completed = completed;
		
		if(!completed) {
			System.out.println("Course not completed");
		}
		
		System.out.println("Certificate generated");
	}
}

public class LearningApp {

	public static void main(String[] args) {
		new Certificate(true, true, true);
	}

}
