package com.java.practice.string;

public class StringMethod {

	public static void main(String[] args) {
		String str = "Heritage,Institute,of,Technology,Kolkata";
		String[] languages = str.split(",");
		
		for(String lang: languages)
		{
			System.out.println(lang);
		}
	}

}
