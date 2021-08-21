package com.junior.ImparteSurprize;

import java.util.ArrayList;

public class FIFOQueueBag implements IBag{
	
	ArrayList<ISurprise> queue;

	public FIFOQueueBag() {
		queue = new ArrayList<>();
	}

	@Override
	public void put(ISurprise surprise) {
		queue.add(surprise);
	}

	@Override
	public void put(IBag bag) {
		while (!bag.isEmpty()) {
			queue.add(bag.takeOut());
		}
	}

	@Override
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	@Override
	public ISurprise takeOut() {
		return queue.remove(0);
	}

	@Override
	public int size() {
		return queue.size();
	}

	
}
