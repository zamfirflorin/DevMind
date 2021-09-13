package com.junior.ImparteSurprize;

import java.util.ArrayList;
import java.util.Random;

public class RandomBag implements IBag {

	private static final Random random = new Random();
	private ArrayList<ISurprise> bag;
	
	
	public RandomBag() {
		bag = new ArrayList<>();
	}
	
	@Override
	public void put(ISurprise surprise) {
		bag.add(surprise);
	}

	@Override
	public void put(IBag baggy) {
		while (!baggy.isEmpty()) {
			bag.add(baggy.takeOut());
		}
	}

	@Override
	public boolean isEmpty() {
		return bag.isEmpty();
	}

	@Override
	public ISurprise takeOut() {
		int index = random.nextInt(bag.size());
		return bag.remove(index);
	}

	@Override
	public int size() {
		return bag.size();
	}


}
