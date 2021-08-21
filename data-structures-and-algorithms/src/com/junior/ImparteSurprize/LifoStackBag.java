package com.junior.ImparteSurprize;

import java.util.ArrayList;

public class LifoStackBag implements IBag {

	private ArrayList<ISurprise> stack;

	
	public LifoStackBag() {
		stack = new ArrayList<ISurprise>();
	}
	@Override
	public void put(ISurprise surprise) {
		stack.add(surprise);
	}
	@Override
	public ISurprise takeOut() {
		return stack.remove(stack.size() - 1);
	}
	@Override
	public void put(IBag bag) {
		while (!bag.isEmpty()) {
			stack.add(bag.takeOut());
		}
	}
	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	@Override
	public int size() {
		return stack.size();
	}

}
