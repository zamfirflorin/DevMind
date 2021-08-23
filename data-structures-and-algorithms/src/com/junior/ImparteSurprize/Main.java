package com.junior.ImparteSurprize;

import com.junior.ImparteSurprize.giveSuprises.GiveSurpriseAndApplaud;
import com.junior.ImparteSurprize.surprises.Candy;
import com.junior.ImparteSurprize.surprises.FortuneCookie;
import com.junior.ImparteSurprize.surprises.MinionToy;

public class Main {

	public static void main(String[] args) {
		
		IBag fifoBag = BagFactory.getInstance().makeBag("FIFO");
		IBag lifoBag = BagFactory.getInstance().makeBag("LIFO");
		IBag randomBag = BagFactory.getInstance().makeBag("RANDOM");
		
		ISurprise candy = Candy.generate();
		ISurprise cookie = FortuneCookie.generate();
		ISurprise toy = MinionToy.generate();
		fifoBag.put(candy);
		fifoBag.put(cookie);
		fifoBag.put(toy);
		
		GiveSurpriseAndApplaud giveSurprise = new  GiveSurpriseAndApplaud("LIFO", 10);
		giveSurprise.put(fifoBag);
		giveSurprise.giveAll();
	}

}
