package com.junior.JSONParser;

import java.util.HashMap;
import java.util.Map;


public class JSON_OBJECT<String, K extends IJsonField> implements IJsonField {

	Map<String, IJsonField> map;

	public JSON_OBJECT() {
		super();
		this.map = new HashMap<String, IJsonField>();
	}
	
	public void put(String key, IJsonField obj) {
		map.put(key, obj);
	}
	
	public boolean contains(String key) {
		return map.containsKey(key);
	}
	
	public IJsonField get(String key) {
		return map.get(key);
	}

	@Override
	public void add(IJsonField json) {
		map.put(, json);
	}
	
	public String stringValue(String string) {
		return string;
	}


	
	
	
}
