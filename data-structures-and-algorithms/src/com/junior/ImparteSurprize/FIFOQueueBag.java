package com.junior.ImparteSurprize;

import java.util.ArrayList;

public class FIFOQueueBag implements IBag{
	
	ArrayList<Integer> queue;

	public FIFOQueueBag() {
		queue = new ArrayList<>();
	}

	@Override
	public void put(ISurprise surprise) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void put(IBag bag) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ISurprise takeOut() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}


	public static IBag generate() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
