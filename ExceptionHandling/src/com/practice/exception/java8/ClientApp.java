package com.practice.exception.java8;

import java.io.InputStream;
import java.net.Socket;

public class ClientApp {

	public static void main(String[] args) 
	{
		try(Socket socket = new Socket("localhost", 8080);
				InputStream is = socket.getInputStream()) {
			System.out.println("Connected to server");
		}
		catch(Exception e)
		{
			System.out.println("Server connection failed");
		}

	}

}
