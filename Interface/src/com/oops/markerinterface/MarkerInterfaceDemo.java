package com.oops.markerinterface;
interface PremiumUser{
	
}
class Customer implements PremiumUser
{
	String name = "Suman";
	
	Customer(String _name)
	{
		this.name = _name;
	}
}
class RegularCustomer
{
	String name;

    RegularCustomer(String name) {
        this.name = name;
    }
}
class Service {

    public static void provideService(Object obj) {

        if (obj instanceof PremiumUser) {
            System.out.println("Premium Service Enabled");
        } else {
            System.out.println("Normal Service");
        }
    }
}

public class MarkerInterfaceDemo {

    public static void main(String[] args) {

        Customer premiumCustomer = new Customer("Suman");
        RegularCustomer regularCustomer = new RegularCustomer("Riya");

        System.out.println("Checking Premium Customer:");
        Service.provideService(premiumCustomer);  

        System.out.println("\nChecking Regular Customer:");
        Service.provideService(regularCustomer);  
    }
}


