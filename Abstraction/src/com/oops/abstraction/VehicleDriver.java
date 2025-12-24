package com.oops.abstraction;

abstract class Vehicle
{
	abstract void startEngine();
}

class Car extends Vehicle
{
	@Override
	void startEngine()
	{
		System.out.println("Starts Car with CarEngine...");
	}
}

class Bike extends Vehicle
{
	@Override
	void startEngine()
	{
		System.out.println("Starting Bike with BikeEngine...");
	}
}

public class VehicleDriver {

	public static void main(String[] args) {
		
		Vehicle car = new Car();
		car.startEngine();
		
		System.out.println("-------------------------------");
		
		Vehicle bike = new Bike();
		bike.startEngine();

	}

}
