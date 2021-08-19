package com.junior.ImparteSurprize;


public class BagFactory implements IBagFactory{

	@Override
	public IBag makeBag(String name) {
		switch (name) {
			case "RANDOM":
				return RandomBag.generate();
			case "Fifo":
				return FIFOQueueBag.generate();
			case "Lifo":
				return LifoStackBag.generate();	
		}
		return null;
	}
	
}
