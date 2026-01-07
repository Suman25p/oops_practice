package com.practice.exception.java8;

import java.io.FileWriter;

public class AppLogger {

	public static void main(String[] args) 
	{
		try(FileWriter writer = new FileWriter("app1.log", true))
		{
			writer.write("Application started successfully\n");
		}
		catch(Exception e) {
			System.out.println("Unable to write logs");
		}
	}

}
