package com.oops.abstraction.interfaces.java8.staticc;

public interface IBanking {
	
	public static final int MAX = 100; //constant
	
	public abstract void doFundTransfer(); //public abstract
	
	//this method will be used by all the classes....
	public static void printPassbook(String bankName, String logo) {
		System.out.println("Printing Passbook " + bankName + " with logo : " + logo);
	}
	
	public default void printCkBookk(String bankName, String logo)
	{
		System.out.println(" printing" + bankName);
		connectToPrinterr(); //when we use i default method it can be non static
	}
	
	private  void connectToPrinterr()
	{
		//100 lines 
	}
	public static void printCkBook(String bankName, String logo)
	{
		System.out.println(" printing" + bankName);
		connectToPrinter();
	}
	
	//java 9 ---> we will allow to write private method
	private static void connectToPrinter() // when in static method we need static method also
	{
		//100 lines 
	}
}
