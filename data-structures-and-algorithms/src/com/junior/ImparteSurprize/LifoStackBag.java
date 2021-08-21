package com.junior.ImparteSurprize;

import java.util.ArrayList;

public class LifoStackBag implements IBag {

	private ArrayList<ISurprise> stack;
	private int index = stack.size();
	
	public LifoStackBag() {
		stack = new ArrayList<ISurprise>();
	}
	@Override
	public void put(ISurprise surprise) {
		index++;
		stack.add(surprise);
	}
	@Override
	public ISurprise takeOut() {
		ISurprise surprise = stack.get(index);
		return stack.remove(index);
	}
	@Override
	public void put(IBag bagOfSurprises) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	@Override
	public int size() {
		return stack.size();
	}
	public static IBag generate() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
