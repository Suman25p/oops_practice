package com.oops.abstraction.interfaces;

public class ChristmasApp {

	public static void main(String[] args) {
		
		ChristmasGiftService giftService;
		
		giftService = new SantaGiftService();
		giftService.deliverGift("Christeena");
		
		giftService= new CompanyBonusService();
		giftService.deliverGift("Christeena");
		
		giftService = new CharityGiftService();
		giftService.deliverGift("Christeena");
	}

}
