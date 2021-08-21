package com.junior.ImparteSurprize.surprises;

import java.util.Random;

import com.junior.ImparteSurprize.ISurprise;

public class Candy implements ISurprise {

	int nbCandies;
	private String type;
	private static String[] candies = {"chocolate", "jelly", "fruits", "vanilla"};

	private Candy(int nbCandies, String type) {
		this.nbCandies = nbCandies;
		this.type = type;
	}

	@Override
	public void enjoy() {
		
	}

	public static Candy generate() {
		Random random = new Random();
		int nbCandies = random.nextInt();
		int candiesIndex = random.nextInt(candies.length);
		String candyType = candies[candiesIndex];
		return new Candy(nbCandies, candyType);
	}
}
