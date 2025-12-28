package com.oops.interfaces.java9;

class EmailNotification implements INotificationService
{
	
	@Override
	public void send(String message)
	{
		System.out.println("Sending EMAIL: " + message);
	}
}

class SMSNotification implements INotificationService
{
	@Override
	public void send(String message)
	{
		System.out.println("Sending SMS: " + message);
	}
}

public class NotificationApp {

	public static void main(String[] args) {
	
		INotificationService email = new EmailNotification();
		email.notifyUser("Your order is confirmed");
		
		System.out.println("------------------------");
		
		INotificationService sms = new SMSNotification();
		sms.notifyUser("OTP: 762315");
	}

}
