package com.oops.markerinterface;
//marker interface
interface VIPAccess
{
	
}

class UserPerson
{
	String name;
	UserPerson(String _name)
	{
		this.name = _name;
	}
}

class VIPUser extends UserPerson implements VIPAccess
{
	 VIPUser(String name) {
	        super(name);
	    }
}


public class SecuritySystem {

	static void checkAccess(Object obj) {
        if (obj instanceof VIPAccess) {
            System.out.println("VIP Access Granted");
        } else {
            System.out.println("Access Denied");
        }
    }
	
	public static void main(String[] args) {
		 VIPUser vip = new VIPUser("Suman");
		 checkAccess(vip);
		 
	     UserPerson normal = new UserPerson("Riya");
	     checkAccess(normal);
	}

}
