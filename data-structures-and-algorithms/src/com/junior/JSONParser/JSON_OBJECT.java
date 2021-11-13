package com.junior.JSONParser;

import java.util.HashMap;
import java.util.Map;

public class JSON_OBJECT<String, V extends JSON_OBJECT> implements JSON_FIELD {

	Map<String, V> map;

	public JSON_OBJECT(Map<K, V> map) {
		super();
		this.map = new HashMap<K, V>();
	}
	
	public void put(K key, V obj) {
		map.put(key, obj);
	}
	
	public boolean contains(K key) {
		return map.containsKey(key);
	}
	
	public V get(K key) {
		return map.get(key);
	}
	
	
	
	
}
