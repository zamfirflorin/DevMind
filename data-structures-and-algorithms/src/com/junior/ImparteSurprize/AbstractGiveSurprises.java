package com.junior.ImparteSurprize;

public abstract class AbstractGiveSurprises {

	private IBag bag;
	private int waitTime;

	public AbstractGiveSurprises(String type, int waitTime) {
		this.bag = BagFactory.getInstance().makeBag(type);
		this.waitTime = waitTime;
	}
	public void give() {
		
	}
	public void giveAll() {
		
	}
	public boolean isEmpty() {
		return true;
	}
	void put(ISurprise newSurprise) {
		bag.put(newSurprise);
	}
	void put(IBag surprises) {
		bag.put(surprises);
	}
	protected abstract void giveWithPassion();
}

