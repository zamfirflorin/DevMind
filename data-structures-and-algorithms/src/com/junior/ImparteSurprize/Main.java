	package com.junior.ImparteSurprize;

import com.junior.ImparteSurprize.giveSuprises.GiveSurpriseAndApplaud;
import com.junior.ImparteSurprize.surprises.Candy;
import com.junior.ImparteSurprize.surprises.FortuneCookie;
import com.junior.ImparteSurprize.surprises.MinionToy;

public class Main {

	public static void main(String[] args) {
		exGiveSurprisesAndApplauseFIFO();

	}
	
	public static void exGiveSurprisesAndApplauseFIFO() {
		ISurprise s1 = GatherSurprises.gather();
		ISurprise s2 = GatherSurprises.gather();
		ISurprise s3 = GatherSurprises.gather();
		ISurprise s4 = GatherSurprises.gather();
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		GiveSurpriseAndApplaud g = new GiveSurpriseAndApplaud("FIFO", 2);
		g.put(s1);
		g.put(s2);
		g.put(s3);
		g.put(s4);
		g.giveAll();
	}

}
