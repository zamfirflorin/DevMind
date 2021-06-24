package com.florin.p1;

public class Main {

	public static void main(String[] args) {
		
		PlayerStatus playerOne = new PlayerStatus();
		PlayerStatus secondPlayer = new PlayerStatus();
		
		playerOne.initPlayer("Alex", 3, 200000);
		playerOne.movePlayerTo(4, 5);
		playerOne.findArtifact(28);
		playerOne.setWeaponInHand("kalashnikov");

		
		secondPlayer.initPlayer("Florin", 3, 200000);
		secondPlayer.findArtifact(22);
		secondPlayer.setWeaponInHand("kalashnikov");
		secondPlayer.movePlayerTo(12, 14);
		
		playerOne.afiseazaStarea();
		secondPlayer.afiseazaStarea();
		
		if (playerOne.shouldAttackOpponent(secondPlayer)) {
			System.out.println("Ar trebui sa atace");
		} else {
			System.out.println("Nu ar trebui sa atace");
		}
	}
	
}
