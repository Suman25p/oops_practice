package com.oops.polymorphism;

public class FoodDeliveryApp {

	static class OrderService {
		double calculateBill(double foodPrice)
		{
			return foodPrice;
		}
		
		double calculateBill(double foodPrice, double deliveryCharge) {
			return foodPrice + deliveryCharge;
		}
		
		double calculateBill(double foodPrice, double deliveryCharge, double gst) {
			return foodPrice + deliveryCharge + gst;
		}
	}
	
	
	static class DeliveryPartner {
		void deliveryOrder()
		{
			System.out.println("Delivering order using default delivery service");
		}
	}
	
	static class Zomato extends DeliveryPartner {
		@Override
		void deliveryOrder() {
			System.out.println("Order delivered by Zomato delivery partner");
		}
	}
	
	static class Swiggy extends DeliveryPartner {
		@Override
		void deliveryOrder() {
			System.out.println("Order delivered by Swiggy delivery partner");
		}
	}
	
	public static void main(String[] args) {
		
		OrderService service = new OrderService();
		System.out.println("Bill (Food only): " + service.calculateBill(250));
		System.out.println("Bill (Food + Delivery): " + service.calculateBill(250,40));
		System.out.println("Bill (Food + Delivery + GST): " + service.calculateBill(250,40, 25));
		
		DeliveryPartner partner;
		partner = new Zomato();
		partner.deliveryOrder();
		
		partner= new Swiggy();
		partner.deliveryOrder();

	}

}
