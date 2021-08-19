package com.junior.ImparteSurprize;

import java.util.ArrayList;

public class LifoStackBag {

	private ArrayList<Integer> stack;
	private int index = stack.size();
	
	public LifoStackBag() {
		stack = new ArrayList<Integer>();
	}
	void add(Integer n) {
		index++;
		stack.add(n);
	}
	Integer takeOut() {
		return stack.remove(index);
	}
	public static IBag generate() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
