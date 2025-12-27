package com.java.practice.string;

public class EmailTemplateStringBuilder {

	public static void main(String[] args) {
		
		String firstName = "Suman";
		String orderNumber = "ORD127";
		String date = "27-12-2025";
		String amount = "2000";
		String deliveryDate = "06-01-2026";
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Dear ").append(firstName).append(",\n\n");
		sb.append("Thank you for placing order with us.Your order summery below.\n\n");
		sb.append("Order Number:  ").append(orderNumber).append("\n");
		sb.append("Date: ").append(date).append(",\n\n");
		sb.append("Amount : ").append(amount).append("\n");
		sb.append("Delivery Date: ").append(deliveryDate).append("\n\n");
		sb.append("Regards,\n\n");
		sb.append("Team Zepto");
		
		System.out.println(sb.toString());

	}

}
