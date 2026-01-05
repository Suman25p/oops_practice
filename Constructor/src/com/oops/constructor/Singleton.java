package com.oops.constructor;

public class Singleton {
	
	private static Singleton instance;
	
	//private constructor
	private Singleton()
	{
		System.out.println("Singleton object created");
	}
	
	public static Singleton getInstance()
	{
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2));//true
	}

}
