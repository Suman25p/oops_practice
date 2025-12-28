package com.oops.interfaces.java9;

class Utility implements IUtility
{
	//no access to private static method
}

public class UtilityDemo {

	public static void main(String[] args) {
		
		IUtility utility = new Utility();
		utility.execute(10);

	}
}
