package com.oops.interfaces.multipleinheritance;

interface Notification
{
	void send();
}

interface EmailNotification extends Notification {
	//no implemention (before java 8)
}

interface SMSNotification extends Notification {
	//no implementation
}

class UserAlert implements EmailNotification, SMSNotification
{
	@Override
	public void send()
	{
		System.out.println("Sending notification via Email and SMS");
	}
}

public class Driver {

	public static void main(String[] args) {
		
		UserAlert alert = new UserAlert();
		alert.send();
	}

}
