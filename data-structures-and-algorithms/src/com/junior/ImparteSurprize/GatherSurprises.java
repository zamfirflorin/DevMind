package com.junior.ImparteSurprize;

import java.util.Random;

import com.junior.ImparteSurprize.surprises.Candy;
import com.junior.ImparteSurprize.surprises.FortuneCookie;
import com.junior.ImparteSurprize.surprises.MinionToy;

public final class GatherSurprises {

	private GatherSurprises() {
		
	}
	
	public static ISurprise[] gather(int number) {
		ISurprise[] suprises = new ISurprise[number];
		for (ISurprise s : suprises) {
			Random r = new Random();
			int value = r.nextInt(3);
			switch(value) {
				case 0:
					s = MinionToy.generate();
				case 1:
					s = FortuneCookie.generate();
				case 2:
					s = Candy.generate();
			}
		}
		return suprises;
	}
	
	public static ISurprise gather() {
		ISurprise suprise = null;
			Random r = new Random();
			int value = r.nextInt(3);
			switch(value) {
				case 0:
					suprise = MinionToy.generate();
				case 1:
					suprise = FortuneCookie.generate();
				case 2:
					suprise = Candy.generate();
			}
		return suprise;
	}
}
	