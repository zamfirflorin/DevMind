package com.junior.ImparteSurprize.surprises;

import java.util.Random;

import com.junior.ImparteSurprize.ISurprise;

public class Candy implements ISurprise {

	int nbCandies;
	private String type;
	
	//ar putea fi un enum
	//vector de string, ar putea fi un enum
	private static String[] candies = {"chocolate", "jelly", "fruits", "vanilla"};

	private Candy(int nbCandies, String type) {
		this.nbCandies = nbCandies;
		this.type = type;
	}

	@Override
	public void enjoy() {
		System.out.println("Acesta este un candy de tipul " + this.type);
	}

	public static Candy generate() {
		Random random = new Random();
		int nbCandies = random.nextInt(30);
		int candiesIndex = random.nextInt(candies.length);
		String candyType = candies[candiesIndex];
		return new Candy(nbCandies, candyType);
	}

	@Override
	public String toString() {
		return "[Candy] num = " + nbCandies + ", type=" + type + "";
	}
	
	
}
