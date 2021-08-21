package com.junior.ImparteSurprize.giveSuprises;

import com.junior.ImparteSurprize.AbstractGiveSurprises;

public class GiveSurpriseAndHug extends AbstractGiveSurprises {

	public GiveSurpriseAndHug(String type, int waitTime) {
		super(type, waitTime);
		// TODO Auto-generated constructor stub
	}


	@Override
	protected void giveWithPassion() {
		System.out.println("Warm wishes and a big hug!");
		
	}

}
