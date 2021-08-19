package com.junior.ImparteSurprize;


public class BagFactory implements IBagFactory{
	

	@Override
	public IBag makeBag(String name) {
		switch (name) {
			case "RANDOM":
				return RandomBag.generate();
			case "FIFO":
				return FIFOQueueBag.generate();
			case "LIFO":
				return LifoStackBag.generate();	
		}
		return null;
	}
	
}
