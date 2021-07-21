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


	public static void main(String[] args) {
			String s = "Becoming a programmer is like gaining super powers!";
			printCharWithMaxFrequency(s);
	}

}
                                                                                                                                                                                                                                                                              
