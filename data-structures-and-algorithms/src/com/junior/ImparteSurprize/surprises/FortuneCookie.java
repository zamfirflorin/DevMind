package com.junior.ImparteSurprize.surprises;

import java.util.Random;

import com.junior.ImparteSurprize.ISurprise;

public class FortuneCookie implements ISurprise {
	
	private String message;
	private static String[] fortuneMessage = {"If winter comes, can spring be far behind?", 
			"You learn from your mistakes... You will learn a lot today.",
			"You will marry your lover.",
			"Everyone agrees. You are the best.",
			"Land is always on the mind of a flying bird.",
			"A very attractive person has a message for you.",
			"You will be called in to fulfill a position of high honor and responsibility.",
			"Your ability for accomplishment will follow with success.",
			"You already know the answer to the questions lingering inside your head.",
			"Jealousy doesn't open doors, it closes them!",
			"Fortune favors the brave.",
			"It is now, and in this world, that we must live.",
			"Wealth awaits you very soon.",
			"A short stranger will soon enter your life with blessings to share.",
			"Your shoes will make you happy today.",
			"Its amazing how much good you can do if you dont care who gets the credit.",
			"A dream you have will come true.",
			"A new voyage will fill your life with untold memories.",
			"Love can last a lifetime, if you want it to.",
			"You will travel to many exotic places in your lifetime.",
			"Give yourself some peace and quiet for at least a few hours."};

	private FortuneCookie(String message) {
		this.message = message;
	}

	@Override
	public void enjoy() {
		System.out.println("Acesta este un fortune cookie cu mesajul" + this.message);
		
	}
	
	public static FortuneCookie generate() {
		Random random = new Random();
		int index = random.nextInt(fortuneMessage.length);
		return new FortuneCookie(fortuneMessage[index]);
	}

}
