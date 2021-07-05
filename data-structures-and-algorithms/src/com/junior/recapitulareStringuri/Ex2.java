package com.junior.recapitulareStringuri;

import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {

		anagramSolver("fairy tales!", "rail, safety");
		anagramSolver("silver bullet", "sunny day");
		anagramSolver("William Shakespeare", "I am a weakish speller!");
		

	}
	
	public static boolean anagramSolver(String s1, String s2) {
		boolean isAnagram = false;
		s1 = keepLetters(s1);
		s2 = keepLetters(s2);
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if (areEquals(arr1, arr2)) {
			isAnagram = true;
		}
		System.out.println(isAnagram);
		return isAnagram;
	}
	
	private static boolean areEquals(char[] c1, char[] c2) {
		boolean flag = true;
		for(int i = 0; i < c2.length; i++) {
			if (c1[i] != c2[i]) {
				flag = false;
			}
		}
		return flag;
	}
	
	public static String keepLetters(String s1) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s1.length(); i++) {
			if (Character.isLetter(s1.charAt(i))) {
				sb.append(s1.charAt(i));
			}
		}
		return sb.toString();
	}
	
	public static int getValue(char c) {
		return c - '0';
	}
	
	//ex 3


}
