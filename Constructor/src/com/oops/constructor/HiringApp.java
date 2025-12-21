package com.oops.constructor;
class Candidate
{
	String name;
	boolean degreeVerified;
	
	Candidate(String name, boolean degreeVerified) 
	{
		if(!degreeVerified) 
		{
			throw new RuntimeException("Degree not verified");
		}
		this.name = name;
		this.degreeVerified = degreeVerified;
		System.out.println("Candidate eligible");
	}
}

class Interview extends Candidate 
{
	int score;
	
	Interview(String name, boolean degreeVerified, int score) 
	{
		super(name,degreeVerified);
		
		if(score < 60) {
			throw new RuntimeException("Interview failed");
		}
		this.score = score;
		System.out.println("Interview passed");
	}
}

class OfferLetter extends Interview 
{
	double salary;
	
	OfferLetter(String name, boolean degreeVerified, int score,int experience)
	{
		super(name, degreeVerified, score);
		
		if(experience >= 5) {
			salary = 120000;
		} else {
			salary = 600000;
		}
		
		System.out.println("Offer Released: " + salary);
	}
}

public class HiringApp {

	public static void main(String[] args) {
		
		new OfferLetter("Suman", true, 85 , 3);

	}

}
