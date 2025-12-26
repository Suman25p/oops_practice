package com.oops.abstraction.interfaces.java8;

public interface IMessage {
	
	void display();
	
	default void print()
	{
		System.out.println("IMessage.print()...");
	}

}
