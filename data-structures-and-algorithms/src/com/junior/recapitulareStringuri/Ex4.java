package com.junior.recapitulareStringuri;

import java.util.Arrays;

//Filter: String template tema
public class Ex4 {

	public static void main(String[] args) {
		
		String[] arr = new String[] {"clothes", "ant", "drop", "Fly", "racoon", "class", "Plane"};
		arr = selectiveFilter(arr, "plot", 2);
		for (String s : arr) {
			System.out.print(s + " ");
		}
	}
	
	public static String[] selectiveFilter(String[] words, String key, int matchKey) {
		key = key.toLowerCase();
		int size = 0;
		String[] results = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			String currentWord = words[i].toLowerCase();
			int cnt = 0;
			int minLength = key.length() >= currentWord.length() ? currentWord.length() : key.length();
			for (int j = 0; j < minLength; j++) {
				if (currentWord.charAt(j) == key.charAt(j)) {
					cnt++;
				}
			}
			if (cnt >= matchKey) {
				results[size] = words[i];
				size++;
			}
			
		}
		return Arrays.copyOf(results, size);
	}

}
