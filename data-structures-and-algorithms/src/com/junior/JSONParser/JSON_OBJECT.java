package com.junior.JSONParser;

import java.util.HashMap;
import java.util.Map;


public class JSON_OBJECT<String, Object> implements IJsonField {

	Map<String, Object> map;

	public JSON_OBJECT() {
		super();
		this.map = new HashMap<String, Object>();
	}
	
	public void put(String key, java.lang.Object obj) {
		map.put(key, (Object) obj);
	}
	
	public boolean contains(String key) {
		return map.containsKey(key);
	}
	
	public Object get(String key) {
		return map.get(key);
	}


	public String stringValue(String string) {
		return string;
	}

	@Override
	public void add(IJsonField json) {
		// TODO Auto-generated method stub
		
	}


	
	
	
}
