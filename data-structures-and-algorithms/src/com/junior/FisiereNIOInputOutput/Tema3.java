package com.junior.FisiereNIOInputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tema3 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<>();
		BufferedWriter bw =  new BufferedWriter(new FileWriter("results.txt"));
		
		while (sc.hasNextLine()) {
			String word = sc.nextLine();
			if (word.equals("quit")) break;
			words.add(word);
			
		}
		try {
			processWords(words, bw);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void processWords(ArrayList<String> words, BufferedWriter bw) throws IOException {
		String longestWord = getLongestWord(words);
		String shortestWord = getShortestWord(words);
		String firstAlphabeticalWord = getFirstAlphabeticalWord(words);
		String lastAlphabeticalWord = getLastAlphabeticalWord(words);
		int totalNumberOfWords = words.size();
		bw.append("Cel mai scurt cuvant este: " + shortestWord);
		bw.append("\nCel mai lung cuvant este: " + longestWord);
		bw.append("\nPrimul cuvant in ordine alfabetica este: " + firstAlphabeticalWord);
		bw.append("\nUltimul cuvant in ordine alfabetica este : " + lastAlphabeticalWord);
		bw.append("\nNumarul total de cuvinte este : " + totalNumberOfWords);
		bw.flush();
	}
	
	private static String getFirstAlphabeticalWord(ArrayList<String> words) {
		Collections.sort(words);
		return words.get(0);
	}

	private static String getLastAlphabeticalWord(ArrayList<String> words) {
		Collections.sort(words);
		return words.get(words.size() - 1);
	}

	private static String getShortestWord(ArrayList<String> words) {
		String shortestWord = getLongestWord(words);
		for (String s : words) {
			if (s.length() <= shortestWord.length()) {
				shortestWord = s;
			}
		}
		return shortestWord;
	}

	public static String getLongestWord(ArrayList<String> words) {
		String longestWord = "";
		for (String s : words) {
			if (s.length() >= longestWord.length()) {
				longestWord = s;
			}
		}
		return longestWord;
	}
	

}
