package com.junior.ImparteSurprize;

import java.util.ArrayList;

public class LifoStackBag {

	ArrayList<Integer> stack;
	int index = stack.size();
	
	public LifoStackBag() {
		stack = new ArrayList<Integer>();
	}
	
	void add() {
		stack.add(index);
	}
	Integer takeOut() {
		return stack.remove(index);
	}
}
