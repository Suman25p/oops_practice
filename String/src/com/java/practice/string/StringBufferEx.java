package com.java.practice.string;

public class StringBufferEx {

	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Kodewala Academy");
		
		sb.append(", BTM");
		sb.append(", Banagalore");
		
		System.out.println("Details:  " + sb);
	}

}

//Details:  Kodewala Academy, BTM, Banagalore