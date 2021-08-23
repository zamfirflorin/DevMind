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

	public ISurprise give() {
		return bag.takeOut();
	}

	public ArrayList<ISurprise> giveAll() {
		ArrayList<ISurprise> list = new ArrayList<ISurprise>();
		while (!bag.isEmpty()) {
			list.add(bag.takeOut());
		}
		try {
			  TimeUnit.SECONDS.sleep(10); // number of seconds to sleep
			} catch (InterruptedException e) {
			  // TODO Auto-generated catch block
			  e.printStackTrace();
			}
		return list;
	}

	public boolean isEmpty() {
		return bag.isEmpty();
	}

	void put(ISurprise newSurprise) {
		bag.put(newSurprise);
	}

	void put(IBag surprises) {
		bag.put(surprises);
	}

	protected abstract void giveWithPassion();
}
