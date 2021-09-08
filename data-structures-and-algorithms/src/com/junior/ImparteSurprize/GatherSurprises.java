package com.junior.ImparteSurprize;

import java.util.Random;

import com.junior.ImparteSurprize.surprises.Candy;
import com.junior.ImparteSurprize.surprises.FortuneCookie;
import com.junior.ImparteSurprize.surprises.MinionToy;

public final class GatherSurprises {

	private GatherSurprises() {
		
	}
	
	public static ISurprise[] gather(int number) {
		//edge case - daca number == -1 sau number == 0
		ISurprise[] suprises = new ISurprise[number];
		for (ISurprise s : suprises) {
			Random r = new Random();
			int value = r.nextInt(2);
			switch(value) {
				case 0:
					s = MinionToy.generate();
					break;
				case 1:
					s = FortuneCookie.generate();
					break;
				default:
					s = Candy.generate();
			}
		}
		return suprises;
	}
	
	public static ISurprise gather() {
		ISurprise suprise = null;
			Random r = new Random();
			int value = r.nextInt(2);
			switch(value) {
				case 0:
					suprise = MinionToy.generate();
					break;
				case 1:
					suprise = FortuneCookie.generate();
					break;
				default:
					suprise = Candy.generate();
			}
		return suprise;
	}
}
	