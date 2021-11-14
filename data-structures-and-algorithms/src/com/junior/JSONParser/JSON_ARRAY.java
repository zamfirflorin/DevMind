package com.junior.JSONParser;

import java.util.ArrayList;

public class JSON_ARRAY implements IJsonField {

	ArrayList<IJsonField> arr;

	public JSON_ARRAY() {
		this.arr = new ArrayList<>();
	}
	
	@Override
	public void add(IJsonField json) {
		arr.add(json);
	}

	
}

