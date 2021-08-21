package com.junior.ImparteSurprize;


public class BagFactory implements IBagFactory{
	
	private static BagFactory bag;

	@Override
	public IBag makeBag(String name) {
		switch (name) {
			case "RANDOM":
				return new RandomBag();
			case "FIFO":
				return new FIFOQueueBag();
			case "LIFO":
				return new LifoStackBag();	
		}
		return null;
	}
	
	private BagFactory() {
		
	}
	
	public static BagFactory getInstance() {
		if (bag == null) {
			bag = new BagFactory();
		}
		return bag;
	}
	
}
