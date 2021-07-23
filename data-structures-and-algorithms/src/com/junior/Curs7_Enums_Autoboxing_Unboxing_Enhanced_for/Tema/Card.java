package com.junior.Curs7_Enums_Autoboxing_Unboxing_Enhanced_for.Tema;

public class Card {

	Rank rank;
	Suit suit;
	
	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public Rank getRank() {
		return this.rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
	public Suit getSuit() {
		return this.suit;
	}
	
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
		
}
