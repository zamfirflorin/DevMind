package com.junior.ImparteSurprize;

import java.util.Random;

public class Candy implements ISurprise {

	int nbCandies;
	String type;
	static String[] candies = {"chocolate", "jelly", "fruits", "vanilla"};

	private Candy(int nbCandies, String type) {
		this.nbCandies = nbCandies;
		this.type = type;
	}

	@Override
	public void enjoy() {
	
	}
	
	static Candy generate() {
		Random random = new Random();
		int nbCandies = random.nextInt();
		int candiesIndex = random.nextInt(candies.length);
		String candyType = candies[candiesIndex];
		return new Candy(nbCandies, candyType);
	}
}
