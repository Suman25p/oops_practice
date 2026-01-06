package com.interview.practice;

public class Driver {

	public static void main(String[] args) {
		//case 1
		Integer a = 1;
		Integer b = 1;
		
		System.out.println(a==b); //true
		System.out.println(a.equals(b));//true
		
		//case 2
		int num = 10;
		int num2 = 10;
				
		System.out.println(num==num2); //true 
		//System.out.println(num.equals(num2)); //Cannot invoke equals(int) on the primitive type int
		
		//case3
		int number = 5000;
		int number2 = 5000;
		
		System.out.println(number == number2); //true //== compares values for int
		
		//case 4
		Integer number3 = 5000;
		Integer number4 = 5000;
		
		System.out.println(number3 == number4); //false
		System.out.println(number3.equals(number4));//true
		
		//case 5
		Integer number5 = 6000;
		Integer number6 = 6000;
				
		System.out.println(number5 == number6); //false
		System.out.println(number5.equals(number6));//true
		
		//case 6
		Integer number7 = 127;
		Integer number8 = 127;
						
		System.out.println(number7 == number8); //true //-128 to 127(Range)
		System.out.println(number7.equals(number8));//true
		
		//case 6
		Integer number9 = 128;
		Integer number10 = 128;
								
		System.out.println(number9 == number10); //false //-128 to 127(Range)
		System.out.println(number9.equals(number10));//true
		
		//case 7
		Integer number11 = 100; //Stored in Integer Cache
		Integer number12 = new Integer(100); //Stored in heap created new object
		System.out.println(number11 == number12);//false
		System.out.println(number11.equals(number12)); //true
		
		
	}

}
