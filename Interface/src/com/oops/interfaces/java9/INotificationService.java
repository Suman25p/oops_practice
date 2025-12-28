package com.oops.interfaces.java9;

public interface INotificationService 
{
	public abstract void send(String message);
	
	default void notifyUser(String message)
	{
		if(isValid(message))
		{
			String formattedMsg = formatMessage(message);
			log(formattedMsg);
			send(formattedMsg);
		} else {
			System.out.println("Invalid Notification message");
		}
	}
	
	private static boolean isValid(String message)
	{
		return message != null && ! message.trim().isEmpty();
	}
	
	private static String formatMessage(String message)
	{
		return "[NOTIFICATION]" + message;
	}
	
	private static void log(String message) {
		System.out.println("Logging notification: " + message);
	}
}
