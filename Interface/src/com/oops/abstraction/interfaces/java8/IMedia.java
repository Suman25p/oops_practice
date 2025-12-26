package com.oops.abstraction.interfaces.java8;

public interface IMedia {
	
	void display();
	
	default void print()
	{
		System.out.println("IMessage.print()...");
	}
}
