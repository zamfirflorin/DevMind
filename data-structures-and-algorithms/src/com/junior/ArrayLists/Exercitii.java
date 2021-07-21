package com.junior.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercitii {

	
	public static void printCharWithMaxFrequency(String s) {
		s = s.toLowerCase();
		ArrayList<Character> result = new ArrayList<Character>();
		int maxFreq = 0;
		char[] aux = s.toCharArray();
		Arrays.sort(aux);
		s = "";
		for(int i = 0; i < aux.length; i++) {
			s = s + aux[i];
		}
		for (int i = 0; i < s.length(); i++) {
			if (Character.isWhitespace(s.charAt(i))) {
				continue;
			}
			
			int charFreq = 0;
			for (int j = i; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					charFreq++;
				}

			}
			
			if (charFreq == maxFreq) {
				result.add(s.charAt(i));
			} else if (charFreq > maxFreq) {
				result.clear();
				result.add(s.charAt(i));
				maxFreq = charFreq;
			}
		}
		for(char c: result) {
			System.out.println(c + " appears " + maxFreq + " times.");
		}
	}

	public static void main(String[] args) {
			String s = "Becoming a programmer is like gaining super powers!";
			printCharWithMaxFrequency(s);
	}

}