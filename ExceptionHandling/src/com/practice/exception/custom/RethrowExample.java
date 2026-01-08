package com.practice.exception.custom;
class DataAccessLayer
{
	void readData() throws Exception{
		throw new Exception("Database connection failed");
	}
}

class ServiceLayer {
	void process() throws Exception {
		try {
			new DataAccessLayer().readData();
		}catch(Exception e) {
			System.out.println("Logging error in Service Layer");
			throw e; //rethrowing same exception
		}
	}
}

public class RethrowExample {

	public static void main(String[] args) {
		try {
			new ServiceLayer().process();
		}catch(Exception e) {
			System.out.println("Handled in Controller: " + e.getMessage());
		}

	}

}
