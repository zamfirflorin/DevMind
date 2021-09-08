package com.junior.ImparteSurprize.surprises;

import com.junior.ImparteSurprize.ISurprise;

public class MinionToy implements ISurprise {
	
	private String name;
	private static String[] minionToys = {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"};
	private static int counter;
	
	private MinionToy(String name) {
		this.name = name;
	}

	@Override
	public void enjoy() {
		System.out.println("Acesta este un minion toy pe nume " + this.name);
	}

	public static MinionToy generate() {
		if (counter >= minionToys.length) {
			counter = 0;
		}
		String minion = minionToys[counter];
		counter++;
		return new MinionToy(minion);
	}

	@Override
	public String toString() {
		return "[MinionToy] name=" + name + "";
	}
	
}
