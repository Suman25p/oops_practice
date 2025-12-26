package com.oops.interfaces.multipleinheritance;

interface Device
{
	public abstract void start();
}

interface Phone extends Device
{
	
}

interface Camera extends Device
{
	
}

class SmartPhone implements Phone, Camera
{
	@Override
	public void start() {
		System.out.println("SmartPhone started with calling and camera features");
	}
}

public class SmartDeviceDriver {

	public static void main(String[] args) {
		
		SmartPhone phone = new SmartPhone();
		phone.start();

	}

}
