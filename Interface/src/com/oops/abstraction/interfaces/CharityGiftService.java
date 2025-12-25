package com.oops.abstraction.interfaces;

public class CharityGiftService implements ChristmasGiftService {
	
	@Override
	public void deliverGift(String personName)
	{
		System.out.println("\nCharity send Christmas essentials to " + personName);
	}

}
