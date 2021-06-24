package com.florin.curs20;

import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
	    String phrase = "This game was fun to play!";
	    printOccurences(phrase);
	}
	
	public static int countLetters(String letters, char ch) {
		int counter = 0;
		int index = letters.indexOf(ch);
		
		while (index >= 0) {
			counter++;
			index = letters.indexOf(ch, index+1);
		}
		return counter;
	}
	
	
	public static void printOccurences(String str) {
		String aux = "";
		for (int i = 0;  i < str.length(); i++) {
			if (!containsLetters(aux, str.charAt(i))) {
				System.out.println("Character: '" + str.charAt(i) + "' appears:" + countChar(str, str.charAt(i)) + " time(s)");
				aux += str.charAt(i);
			}
			
		}
	}
	
	public static boolean containsLetters(String str, char ch) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				return true;
			}
		}
		return false;
	}

	
	public static int countChar(String str, char ch) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				counter++;
			}
		}
		return counter;
	}

}
