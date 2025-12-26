package com.oops.interfaces.multipleinheritance;

interface EmailSupport {
	void createTicket(String email);
}

interface PhoneSupport 
{
	void createTicket(long phoneNumber);
}

class SupportService implements EmailSupport, PhoneSupport
{
	@Override
	public void createTicket(String email)
	{
		System.out.println("Support ticket created using Email: " + email);
	}
	
	@Override
	public void createTicket(long phoneNumber) {
		System.out.println("Support ticket created using Phone: " + phoneNumber);
	}
}

public class SupportDriver {

	public static void main(String[] args) {
		
		SupportService service = new SupportService();
		
		service.createTicket("suman25@gmail.com");
		service.createTicket(9876839289L);

	}

}
