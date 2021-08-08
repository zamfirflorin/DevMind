package com.junior.ImparteSurprize;

import java.util.Random;

public class Candy implements ISurprise {

	int nbCandies;
	String type;

	private Candy(int nbCandies) {
		this.nbCandies = nbCandies;
	}

	@Override
	public void enjoy() {
	
	}
	
	static Candy generate() {
		Random random = new Random();
		Candy candy = new Candy(random.nextInt());
		return candy;
	}
}
