package com.algoexpert.io;

import java.util.ArrayList;
import java.util.HashMap;

public class TournamentWinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
		String bestTeam = "";
		int HOME_TEAM_WON = 1;
		HashMap<String, Integer> scores = new HashMap<>();

		for (int i = 0; i < competitions.size(); i++) {
			if (results.get(i) == HOME_TEAM_WON) {

			}
		}

		return "";
	}
	
	public void updateScores(HashMap<String, Integer> scores, String key, int points) {
		if (scores.containsKey(key)) {
			
		}
	}
}
