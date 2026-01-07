package com.practice.exception.java8;

import java.io.BufferedReader;
import java .io.FileReader;

public class FileProcessor {

	public static void main(String[] args) 
	{
		try(BufferedReader br = new BufferedReader(new FileReader("users.txt"))) // AutoCloseable 
		{
			String line;
			while((line = br.readLine()) != null) 
			{
				System.out.println(" User: " + line);
			}
		} catch(Exception e)
		{
			
			System.out.println("Error while reading file");
		}
		
	}

}

//Error while reading file