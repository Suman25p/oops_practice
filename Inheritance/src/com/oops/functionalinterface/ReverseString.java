package com.oops.functionalinterface;
//Reverse a String 

@FunctionalInterface
interface StringReverse
{
	public abstract String reverse(String str);
}

public class ReverseString {

	public static void main(String[] args) 
	{
		StringReverse string = str ->
		{
			String result = " ";
			for(int i = str.length()-1; i>=0 ; i--)
			{
				result += str.charAt(i);
			}
			return result;
		};
		
		System.out.println("Reversing String:" + string.reverse("SPRINGBOOT"));
	}

}
