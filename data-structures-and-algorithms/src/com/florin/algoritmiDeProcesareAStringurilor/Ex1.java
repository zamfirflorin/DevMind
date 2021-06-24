package com.florin.algoritmiDeProcesareAStringurilor;

public class Ex1 {

	public static void main(String[] args) {
			

	}

	public static int countValidWords(String prop, String cuv) {
		int start = 0; 
		int end = 0; 
		return 0;
	}
	
	static boolean checkValid(String word, String key) {
		
		for (int i = 0; i < word.length(); i++) {
			if (key.indexOf(word.charAt(i)) >= 0) {
				return true;
			} 
		}
		return false;
	}
	
	static boolean  isSymbol(char c) {
		String symbols = "!;,.'/?";
		int index = symbols.indexOf(c);
		if (index >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
}
