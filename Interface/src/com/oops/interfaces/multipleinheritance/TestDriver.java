package com.oops.interfaces.multipleinheritance;

interface A
{
	int getValue();
}
interface B
{
	String getValue(); //X incompatible return type
	
}

//class Test implements A, B {
	//giving compilation failure bcz here method return type is different
//	@Override
//	public int getValue()
//	{
//		return 10;
//	}
	
//}
public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
