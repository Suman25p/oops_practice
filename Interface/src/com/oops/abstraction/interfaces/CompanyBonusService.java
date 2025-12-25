package com.oops.abstraction.interfaces;

public class CompanyBonusService implements ChristmasGiftService {
	
	@Override
	public void deliverGift(String personName) {
		System.out.println("\nCompany credited Christmas bonus to " + personName);
	}

}
