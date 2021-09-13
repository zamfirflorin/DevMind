	package com.junior.ImparteSurprize;

import com.junior.ImparteSurprize.giveSuprises.GiveSurpriseAndApplaud;
import com.junior.ImparteSurprize.surprises.Candy;
import com.junior.ImparteSurprize.surprises.FortuneCookie;
import com.junior.ImparteSurprize.surprises.MinionToy;

public class Main {

	public static void main(String[] args) {
		System.out.println("\n\t ===== testGiveSurprisesAndApplauseFIFO ===== \t\n");
		testGiveSurprisesAndApplauseFIFO();
		System.out.println("\n\t ===== testGiveSurprisesAndApplauseLIFO ===== \t\n");
		testGiveSurprisesAndApplauseLIFO();
		System.out.println("\n\t ===== testGiveSurprisesAndApplauseRANDOM ===== \t\n");
		testGiveSurprisesAndApplauseRANDOM();

	}
	
	public static void testGiveSurprisesAndApplauseFIFO() {
		ISurprise s1 = GatherSurprises.gather();
		ISurprise s2 = GatherSurprises.gather();
		ISurprise s3 = GatherSurprises.gather();
		ISurprise s4 = GatherSurprises.gather();
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		GiveSurpriseAndApplaud g = new GiveSurpriseAndApplaud("FIFO", 1);
		
		
		
		g.put(s1);
		g.put(s2);
		g.put(s3);
		g.put(s4);
		
		System.out.println("\n ==== Giving === \n");
		
		g.giveAll();
	}
	
	public static void testGiveSurprisesAndApplauseLIFO() {
		ISurprise s1 = GatherSurprises.gather();
		ISurprise s2 = GatherSurprises.gather();
		ISurprise s3 = GatherSurprises.gather();
		ISurprise s4 = GatherSurprises.gather();
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		GiveSurpriseAndApplaud g = new GiveSurpriseAndApplaud("LIFO", 1);
		g.put(s1);
		g.put(s2);
		g.put(s3);
		g.put(s4);
		
		System.out.println("\n ==== Giving === \n");
		
		g.giveAll();
	}
	
	
	public static void testGiveSurprisesAndApplauseRANDOM() {
		ISurprise s1 = GatherSurprises.gather();
		ISurprise s2 = GatherSurprises.gather();
		ISurprise s3 = GatherSurprises.gather();
		ISurprise s4 = GatherSurprises.gather();
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		GiveSurpriseAndApplaud g = new GiveSurpriseAndApplaud("RANDOM", 1);
		g.put(s1);
		g.put(s2);
		g.put(s3);
		g.put(s4);
		
		System.out.println("\n ==== Giving === \n");
		
		g.giveAll();
	}
	
	

}
