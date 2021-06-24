package com.florin.curs19;

import java.util.Arrays;
import java.util.Scanner;

public class Tema_Curs19 {

	public static void main(String[] args) {
/*		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti numarul de cuvinte: ");
		int n = sc.nextInt();
		int counter = 0;
		String[] strings = new String[counter];
		
		System.out.println("Introduceti cuvintele");
		
		while (counter < n) {
			if (counter == strings.length) {
				strings = Arrays.copyOf(strings, counter+1);
			}
			strings[counter] = sc.next();
			counter++;
		}*/
		String[] arr = new String[]{"reference", "class", "method", "type", "constructor", "recursive"};
		
		String key = "structure";
		startsWith(arr, key);
		
		int[] digits = new int[]{2, 10, 784, 17, 90, 418};
		int digit = 1;
		containsDigit(digits, digit);
		lettersMatchIgnoreCase(arr, key);

	}
	// "reference" "class" "method" "type", "constructor", "recursive", "structure"
	public static void startsWith(String[] arr, String str) {
		for (int i = 0; i < str.length(); i++) {
			boolean check = false;
			
			for (int j = 0; j < i; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					check = true;
				}
			}
			
			if (check == true) {
				continue;
			} else {
				System.out.print(str.charAt(i) + " : ");
			}
			
			for (int j = 0; j < arr.length; j++) {
				
				if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(arr[j].charAt(0))) {
					System.out.print(arr[j] + ", ");
				}
			}
			System.out.println();
		}
	}
	
	public static String[] lettersMatchIgnoreCase(String[] array, String key) {
		int counter = 0;
		String[] words = new String[counter];		
		for (int i = 0; i < array.length; i++) {
			if (containsAnyLetter(array[i], key)) {
				if (counter == words.length) {
					words = Arrays.copyOf(words, counter+1);
				}
				words[counter] = array[i];
				counter++;
			}
		}	
		for (String s : words) {
			System.out.println(s);
		}
		System.out.println(words.length);
		return words;
	}
	
	public static boolean containsAnyLetter(String str, String key) {
		boolean isLetterInStr = false;	
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < key.length(); j++) {
				if ((Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(key.charAt(j))) && i == j) {
					isLetterInStr = true;
				}
			}
		}
		return isLetterInStr;
	}

	//ex3
	
	public static int[] containsDigit(int[] array, int digit) {
		int counter = 0;
		int[] aux = new int[counter];
		boolean check = false;
		for (int i = 0; i < array.length; i++) {
			int n = array[i];
			while (n > 0) {
				if (n % 10 == digit) {
					if (counter == aux.length) {
						aux = Arrays.copyOf(aux, aux.length+1);
					}
					aux[counter] = array[i];
					counter++;
				}
				n /= 10;
			}
		}
		for (int n : aux) {
			System.out.print(n + " ");
		}
		System.out.println("array length: " + aux.length);
		return aux;	
	}
	
}
