package com.oops.interfaces.multipleinheritance.java8;
interface Email
{
	default void send() {
		System.out.println("Sending notification via Email");
	}
}

interface SMS
{
	default void send()
	{
		System.out.println("Sending notification via SMS");
	}
}

class OrderService implements Email, SMS
{

	@Override
	public void send() {
		// TODO Auto-generated method stub
		SMS.super.send();
	}
	
//	void send() {
//		//Cannot reduce the visibility of the inherited method from SMS
//	}
	
//	@Override
//	public void send() {
//		System.out.println("OrderService is printing...");
//	}
	//OrderService is printing...
	
	
}
public class NotificationImpDriver {

	public static void main(String[] args) {
		
		OrderService service = new OrderService();
		service.send();

	}

}
