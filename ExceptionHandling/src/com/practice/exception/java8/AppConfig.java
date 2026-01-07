package com.practice.exception.java8;

import java.io.FileInputStream;
import java.util.Properties;

public class AppConfig {

	public static void main(String[] args) 
	{
		try(FileInputStream fis = new FileInputStream("app.properties"))
		{
			Properties props = new Properties();
			props.load(fis);
			
			System.out.println("DB URL: " + props.getProperty("db.url"));
			
		}catch(Exception e){
			System.out.println("Failed to load configuration file");
		}

	}

}

//Failed to load configuration file