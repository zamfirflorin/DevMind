package com.junior.ImparteSurprize.giveSuprises;

import com.junior.ImparteSurprize.AbstractGiveSurprises;

public class GiveSurpriseAndApplaud extends AbstractGiveSurprises {


	public GiveSurpriseAndApplaud(String type, int waitTime) {
		super(type, waitTime);
	}

	@Override
	protected void giveWithPassion() {
		System.out.println("Loud applause to you… For it is in giving that we receive.\n");
	}

}
