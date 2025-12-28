package com.oops.interfaces.java9;

class Addition implements ICalculator
{
	@Override
	public void calculate(int num1, int num2)
	{
		System.out.println("Sum of two numbers :" + (num1 + num2));
	}
}

public class CalculatorDevice {

	public static void main(String[] args) 
	{
		
		ICalculator calc = new Addition();
		calc.process(20, 50);
	}

}
