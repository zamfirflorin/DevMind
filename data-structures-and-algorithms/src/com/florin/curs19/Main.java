package com.florin.curs19;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	

	public static boolean search(String[] array, String key) {
		for (int i = 0; i < array.length; ++i) {
			System.out.print(array[i] + "");
			if (array[i].equals(key)) {
				return true;
			}
		}
		return false;
	}
	
	public static int countKey(String[] array, String key) {
		int counter = 0;
		key = key.toLowerCase();
		for (int i = 0; i < array.length; ++i) {
			System.out.print(array[i] + " ");
			// first sol
			String aux = array[i].toLowerCase();
			if (aux.equals(key)) {
				++counter;
			}
			// second sol
			if (array[i].toLowerCase().equals(key)) {
				++counter;
			}
			// third sol
			if (array[i].equalsIgnoreCase(key)) {
				++counter;
			}
		}
		System.out.println();
		return counter;
	}
	/*
	 *
	 *		String aux <- letters sortat;
		for (int i = 0; i < aux.length; ++i) {
			if (i != 0 && aux.charAt(i) != aux.charAt(i - 1)) {
				// cautam in words toate cuvintele care incep cu aux[i]
			}
		}
	 */
	
	public static boolean search2(String letters, char c, int rightLimit) {
		// cautam caracter c in cuvantul letters pana la pozitia rightLimit
		for (int j = 0; j < rightLimit; j++) {
			if (letters.charAt(j) == c) {
				return true;
			}
		}
		return false;
	}
	

	public static void findWordsByLetters(String[] words, String letters) {
		
		for (int i = 0; i < letters.length(); ++i) {
			//verificam daca am mai folosit litera letters[i]
			if (!search2(letters, letters.charAt(i), i)) {
				System.out.print(letters.charAt(i));
				//cautam caracterul letters[i] in lista de cuvinte words
				for (int j = 0; j < words.length; ++j) {
					if (letters.charAt(i) == words[j].charAt(0)) {
						System.out.print(words[j] + ", ");
					}
				}
				System.out.println();
			}
		}
	}
	
	
	
	
	//6 "reference" "class" "method" "type", "constructor", "recursive", "structure"
	public static void main (String [] args) {	
		int[] ints = new int[100];
		System.out.println(ints[5]);
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] strings = new String[n];
		for (int i = 0; i < n; ++i) {
			if (i == strings.length) {
				strings = Arrays.copyOf(strings, 8);
				System.out.println("NU INTRA AICI");
			}
			strings[i] = sc.next();
		}
		
		String cuv = sc.next();
		
		findWordsByLetters(strings, cuv);
		
		
		
		
		System.out.println(countKey(strings, cuv));
		
		for (int i = 0; i < strings.length; ++i) {
			System.out.println(strings[i]);
		}
	}


}