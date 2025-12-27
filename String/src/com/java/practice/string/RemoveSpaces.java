package com.java.practice.string;

public class RemoveSpaces {

	public static void main(String[] args) {
		StringBuffer msg = new StringBuffer("Java is   high level    language.");
		
		for(int i=0; i<msg.length()-1; i++)
		{
			if(msg.charAt(i) == ' ' && msg.charAt(i+1) == ' ')
			{
				msg.deleteCharAt(i);
				i--;
			}
			
		}
		System.out.println(msg); //Java is high level language.
	}

}
