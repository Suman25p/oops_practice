package com.oops.abstraction.interfaces.java8;

public class PDF implements IMessage, IMedia{

	@Override
	public void print() {
		
		IMedia.super.print(); //we are solving multiple inheritance problem 
		IMessage.super.print();
	}
	

	@Override
	public void display() {
		
		
	}
	
	public static void main(String[] args)
	{
		PDF media = new PDF();
		media.print();
	}

}
