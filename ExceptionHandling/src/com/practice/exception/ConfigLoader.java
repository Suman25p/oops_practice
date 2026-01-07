package com.practice.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ConfigLoader 
{
	public ConfigLoader() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("app.properties");
		System.out.println("Configuration loaded");
	}
	
	public static void main(String[] args) {
		try {
			new ConfigLoader();
		}catch(FileNotFoundException e)
		{
			System.out.println("Config file missing");
		}

	}
}
