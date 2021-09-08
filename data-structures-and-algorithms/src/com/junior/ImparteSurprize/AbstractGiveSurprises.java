package com.junior.ImparteSurprize;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {

	private IBag bag;
	private int waitTime;

	public AbstractGiveSurprises(String type, int waitTime) {
		this.bag = BagFactory.getInstance().makeBag(type);
		this.waitTime = waitTime;
	}

	public void give() {
		if (this.bag.isEmpty()) {
			System.out.println("The bag is empty");
			return;
		}
		
		this.bag.takeOut().enjoy();
		this.giveWithPassion();
	}

	public void giveAll() {
		if (bag.isEmpty()) {
			System.out.println("The bag is empty");
			return;
		}
		int limit = this.bag.size();
		while (limit > 0) {
			try {
				this.give();
				TimeUnit.SECONDS.sleep(waitTime); // number of seconds to sleep
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			limit--;
		}

	}

	public boolean isEmpty() {
		return bag.isEmpty();
	}

	public void put(ISurprise newSurprise) {
		bag.put(newSurprise);
	}

	public void put(IBag surprises) {
		bag.put(surprises);
	}

	protected abstract void giveWithPassion();
}
