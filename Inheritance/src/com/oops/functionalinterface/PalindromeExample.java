package com.oops.functionalinterface;

@FunctionalInterface
interface PalindromeCheck
{
	public abstract boolean isPalindrome(String str);
}

public class PalindromeExample {

	public static void main(String[] args) {
		
		PalindromeCheck check = str ->
		{
			String rev = "";
			for(int i = str.length()-1 ; i>=0 ; i--)
			{
				rev += str.charAt(i);
			}
			
			return str.equals(rev);
		};
		
		System.out.println(check.isPalindrome("MADAM")); //true
		
		System.out.println(check.isPalindrome("JAVA")); //false
	}

}
