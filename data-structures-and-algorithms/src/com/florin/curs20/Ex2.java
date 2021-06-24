package com.florin.curs20;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
/*		String text = sc.nextLine();
		String oldWord = sc.next();
		String newWord = sc.next();*/
		String text = "a creature is a small a part of a big world";
		String oldWord = "a";
		String newWord = "the";
		
		System.out.println(getWords(text, newWord, oldWord));
		
	}

	
	public static String getWords(String s, String newWord, String oldWord) {
		
		s = " " + s + " ";
		oldWord = " " + oldWord + " ";
		newWord = " " + newWord + " ";
		
		int start = s.indexOf(oldWord) + oldWord.length() - 1;
		String s1 = s.substring(0, start);
		
		int end = s.lastIndexOf(oldWord) + 1;
		String s3 = s.substring(end, s.length());
		
		if(start < end) {
			String s2 = s.substring(start, end);
			s2 = s2.replace(oldWord, newWord);
			
			return s1 + s2.replace(oldWord, newWord) + s3;
		}
		
		return s;
	}


}
