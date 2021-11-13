package com.junior.JSONParser;

import java.util.ArrayList;

public class JSON_ARRAY implements JSON_FIELD {

	ArrayList<JSON_OBJECT> arr;

	public JSON_ARRAY() {
		this.arr = new ArrayList<>();
	}
	
	public void add(JSON_OBJECT json) {
		arr.add(json);
	}
	
	
	
	
	
}

