package com.oops.functionalinterface;

@FunctionalInterface
interface Logger
{
	public abstract void log(String message);
}

public class TestLogger {

	public static void main(String[] args) {
		
		Logger fileLogger = message -> System.out.println("Saving log to file: " + message);
		
		Logger dbLogger = message -> System.out.println("Saving log to database" + message);
		
		fileLogger.log("User logged in");
		dbLogger.log("Payment successful!");
	}

}
