package com.java.practice.string;

public class StringUrlBuilder {

	public static void main(String[] args) {
		
		StringBuilder url = new StringBuilder("https://api.example.com/products?");
		
		String category = "electronics";
		int limit = 10;
		String sort = "price";
		
		url.append("category=").append(category).append("&");
		url.append("limit=").append(limit).append("&");
		url.append("sort=").append(sort);

		System.out.println("API URL: " + url);
		
	}

}
