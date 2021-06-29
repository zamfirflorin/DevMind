package com.junior.recapitulareStringuri;

//1. Frecventa maxima
public class Ex1 {

	public static void main(String[] args) {

	}

	/*
	 * void charFreq(String s) {
	int[] count = new int[256];
	s = s.toLower();
	int nr = 0;
	int Max = 0;
	for (int i = 0; i < s.length(); ++i) {
		if (Character.isWhitespace(s.charAt(i)))
			continue;

		int x = s.charAt(i);
		count[x]++;
		if (Max < count[x]) {
			Max = count[x];
		}
	}
	
	for (int i = 0; i < count.length; ++i) {
		if (count[i] == Max) {
			char aux = (char) i;
			// sau aux = Character.toString(i);
			System.out.print(aux + " ");
		}
	}
}
	 */
}
