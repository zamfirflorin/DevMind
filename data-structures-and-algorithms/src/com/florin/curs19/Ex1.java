package com.florin.curs19;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author fszamfi
 *2. Un numar palindrom este un numar care este egal cu simetricul sau (ex: 121, 10001, 22344322, 88, 7 etc.). 
 *Similar, un sir de caractere este palindrom daca este identic cu simetricul sau (ex: „abba“, „ana“, „noon“, „radar“, „madam“). 
 *Implementeaza o metoda (i.e. isPalindromIgnoreCase(String)) care determina daca un sir de caractere este sau nu palindrom, 
 *fara a se tine cont de tipul literelor (i.e. majuscule vs. minuscule). 
 *Testeaza metoda in main pentru cat mai multe cazuri de exceptie.
 */
public class Ex1 {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Introdu marimea arrayului: ");
		int n = sc.nextInt();
		String[] strings = new String[n];

		for (int i = 0; i < n; i++) {
			if (i == strings.length) {
				strings = Arrays.copyOf(strings, strings.length+1);
				System.out.println("S-a marit arrayul");
			}
			strings[i] = sc.next();
		}
		
		System.out.println("Insert key: ");
		String key = sc.next();
		
		System.out.println(countOccurrencesIgnoreCase(strings, key));
		System.out.println(countKey(strings, key));
		System.out.println(search(strings, key));*/
		
		System.out.println(isPalindromIgnoreCase("abba"));
		System.out.println(isPalindromIgnoreCase("noon"));
		System.out.println(isPalindromIgnoreCase("radar"));
		System.out.println(isPalindromIgnoreCase("florinirolf"));
		System.out.println(isPalindromIgnoreCasePRO("Red rum, sir, is murder!"));
		System.out.println(isPalindromIgnoreCasePRO("Was it a cat I saw?"));
		System.out.println(isPalindromIgnoreCasePRO("Not a palindrom, I'm afraid.."));
		System.out.println(isPalindromIgnoreCasePRO("Step on no pets."));
		
	}
	
	public static int countOccurrencesIgnoreCase(String[] array, String key) {
		int counter = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (key.equalsIgnoreCase(array[i])) {
				counter++;
			}
		}
		return counter;
	}
	
	public static int countKey(String[] arr, String key) {
		int counter = 0; 
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[i].toLowerCase().equals(key.toLowerCase())) {
				counter++;
			}
		}
		return counter;
	}
	
	public static boolean search(String[] arr, String key) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
			if (arr[i].equals(key)) {
				return true;
			}
		}
		return false;
	}
	//Ex 2
	
	public static boolean isPalindromIgnoreCaseFlorin(String str) {
		String newStr = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			newStr += str.charAt(i);
		}
		if (newStr.equalsIgnoreCase(str)) {
			return true;
		}
		return false;
	}
	
	//Ex 2
	public static boolean isPalindromIgnoreCase(String str) {
		int len = str.length();
		
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	
	//Ex 3
	public static boolean isPalindromIgnoreCasePRO(String str) {
		int len = str.length();
		int counter = 0;
		char[] sentence = new char[counter];
		
		for (int i = 0; i < len; i++) {		
		//	if (str.charAt(i) != '!' && str.charAt(i) != ',' && str.charAt(i) != ' ') {
			if (!containsChar("! ,.1234567890?;:'][+=-)(*&^%$#@<>';\\{}]", str.charAt(i))) {
				if (counter == sentence.length) {
					sentence = Arrays.copyOf(sentence, counter+1);
				}
				sentence[counter] = str.charAt(i);
				counter++;
			}
			
		}
		
		for (char c : sentence) {
			System.out.print(c);
		}
		System.out.print(" : ");
		for (int i = 0; i < sentence.length / 2; i++) {
			if (Character.toLowerCase(sentence[i]) != Character.toLowerCase(sentence[sentence.length - 1 - i])) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean containsChar(String str, char c) {
		boolean isCharNotInString = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				isCharNotInString = true;
			}
		}
		return isCharNotInString;
		
	}

}
	