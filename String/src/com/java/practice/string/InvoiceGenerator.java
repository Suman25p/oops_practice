package com.java.practice.string;

public class InvoiceGenerator {

	public static void main(String[] args) {
		
		StringBuilder invoice = new StringBuilder();
		
		invoice.append("-------INVOICE-------\n");
		invoice.append("Customer: Naren\n");
		invoice.append("Items: \n");
		invoice.append("1. Laptop -- Rs. 65000\n");
		invoice.append("2. Mouse -- Rs. 1000\n");
		invoice.append("3. Headphone -- Rs. 3000\n");
		
		invoice.append("-----------------------------------\n");
		invoice.append("Total Amount:  + 69000\n");
		
		System.out.println(invoice);

	}

}
