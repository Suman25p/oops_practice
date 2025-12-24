package com.oops.abstraction;

abstract class Notification
{
	abstract void send(String message);
	
	abstract void send(String message, String user);
}

class EmailNotification extends Notification
{
	@Override
	void send(String message)
	{
		System.out.println("Send Email: " + message);
	}
	
	@Override
	void send(String message, String user)
	{
		System.out.println("Sending Email: " + message + " to user : " + user);
	}
}


public class NotificationDriver {

	public static void main(String[] args) {
		
		Notification email = new EmailNotification();
		email.send("Welcome");
		email.send("Welcome", "Suman");
	}

}
