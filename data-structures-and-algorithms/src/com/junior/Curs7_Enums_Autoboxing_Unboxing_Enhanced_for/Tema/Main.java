package com.junior.Curs7_Enums_Autoboxing_Unboxing_Enhanced_for.Tema;

public class Main {

	
	public static void main(String[] args) {
		Deck deck = new Deck();
		
		for (Card card : deck.getDeck()) {
			System.out.println(card.getRank() + " " + card.getSuit());
		}	
	}

}
