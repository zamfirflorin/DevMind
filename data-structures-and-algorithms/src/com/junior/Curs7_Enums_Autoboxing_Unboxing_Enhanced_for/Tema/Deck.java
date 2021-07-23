package com.junior.Curs7_Enums_Autoboxing_Unboxing_Enhanced_for.Tema;

import java.util.ArrayList;

public class Deck {

	ArrayList<Card> cards;
	
	public Deck() {
		cards = new ArrayList<Card>();
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				cards.add(new Card(rank, suit));
			}
		}
	}
	
	public  ArrayList<Card> getDeck() {
		return cards;
	}
	
}
