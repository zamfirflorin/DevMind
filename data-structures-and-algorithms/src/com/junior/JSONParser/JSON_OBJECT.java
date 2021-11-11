package com.junior.JSONParser;

import java.util.HashMap;
import java.util.Map;

public class JSON_OBJECT {

	Map<String, Object> map;

	public JSON_OBJECT() {
		super();
		this.map = new HashMap<>();
	}
	
	public void put(String key, Object obj) {
		map.put(key, obj);
	}
	
	
	
	
}
