package com.florin.Recapitrulare;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String statutCadre = "statut cadre";
		String niveau = "niveau";
		String echelon = "echelon";
		String position = "position";
		String emploiConventionelle = "emploi conventionelle";
		String coefficient = "coefficient";
		
		String sentence1 = ", statut Cadre" + ", position " + position + ", échelon " + echelon + ", coefficient " + coefficient;
		String sentence2 = String.format("statut Cadre %s, position %s, echelon %s, coefficient %s", statutCadre, position, echelon, coefficient);
		String cnp = "192067510110182";
		String TYP_DESIGNE;
		
		if ("2".equals(cnp.charAt(0) + "")) {
			TYP_DESIGNE = "désigné";
		} else {
			TYP_DESIGNE = "désignée";
		}
		String test = "test";
		int val = 1;
		String outer = "outer";
		
		if (val == 1)
			test = "zero";
		else 
			test = "unu";
	
		outer = "changedouter";

		
		int beers = calculateBeers(30);
		System.out.println(beers);
	
	}
	
	private static int calculateBeers(int end) {
		int beers = 0;
		int lastValue = 0;
		for (int i = 0; i <= end; i++) {
			lastValue += i;
			beers += lastValue;
		}
		return beers;
	}

}
