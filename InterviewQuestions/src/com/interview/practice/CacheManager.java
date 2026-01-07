package com.interview.practice;

import java.util.HashMap;
import java.util.Map;

public class CacheManager {
	private static CacheManager instance = new CacheManager();
	private Map<String, String> cache = new HashMap<>();
	
	private CacheManager() { }
	
	public static CacheManager getInstance() {
		return instance;
	}
	public void put(String key, String value)
	{
		cache.put(key, value);
	}
	public static void main(String[] args) {
		
		CacheManager cm = CacheManager.getInstance();
		cm.put("Name", "1234");

	}

}
