package com.junior.ImparteSurprize;


//Singleton
public final class GatherSurprises {

	private GatherSurprises() {
		
	}
	
	public static ISurprise[] gather(int number) {
		return new ISurprise[number];
	}
	
	public static ISurprise gather() {
		return null;
	}
}
	