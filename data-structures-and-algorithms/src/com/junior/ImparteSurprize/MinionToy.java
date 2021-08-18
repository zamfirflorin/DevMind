package com.junior.ImparteSurprize;

public class MinionToy implements ISurprise {
	
	private String name;
	private static String[] minionToys = {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"};
	private static int index;
	
	public MinionToy(String name) {
		this.name = name;
	}

	@Override
	public void enjoy() {
		System.out.println("Acesta este un minion toy cu mesajul" + this.name);
	}

	static MinionToy generate() {
		if (index >= minionToys.length) {
			index = 0;
		}
		String minion = minionToys[index];
		index++;
		return new MinionToy(minion);
	}
}
