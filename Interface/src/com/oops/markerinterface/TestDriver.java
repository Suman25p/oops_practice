package com.oops.markerinterface;

import java.io.Serializable;

class User implements Serializable 
{
	
}

public class TestDriver {

	public static void main(String[] args) {
		
		User user = new User();

		if(user instanceof Serializable)
		{
			System.out.println("Object can be serialized");
		}
		
	}

}
