package com.practice.exception.catchs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.InputMismatchException;

public class OrderProcessor {

	public static void main(String[] args)
	{
		try(FileInputStream fis = new FileInputStream("order.txt")) {
			int data = fis.read();
			System.out.println("Order data read successfully");
		}
		catch(IOException | InputMismatchException e)
		{
			System.out.println("Invalid order file or corrupted data");
		}
		
	}

}
