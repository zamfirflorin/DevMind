package com.junior.ImparteSurprize.giveSuprises;

import com.junior.ImparteSurprize.AbstractGiveSurprises;

public class GiveSurpriseAndSing extends AbstractGiveSurprises {

	public GiveSurpriseAndSing(String type, int waitTime) {
		super(type, waitTime);
	}

	@Override
	protected void giveWithPassion() {
		System.out.println("Singing a nice song, full of joy and genuine excitement…\n");
		
	}

}
