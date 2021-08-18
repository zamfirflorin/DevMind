package com.junior.ImparteSurprize;

public interface IBag {

	void put(ISurprise surprise);
	void put(IBag bag);
	boolean isEmpty();
	ISurprise takeOut();
	int size();

	
}
