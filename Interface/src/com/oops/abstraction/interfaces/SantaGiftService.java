package com.oops.abstraction.interfaces;

public class SantaGiftService implements ChristmasGiftService {
	
	@Override
	public void deliverGift(String personName) {
		System.out.println("Santa deliverd a surprise gift to " + personName);
	}

}
