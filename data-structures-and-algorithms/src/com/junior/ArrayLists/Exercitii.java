package com.junior.ArrayLists;

import java.util.ArrayList;

public class Exercitii {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.ensureCapacity(10);
		names.add("Florin");
		names.add(1, "Elena");
		System.out.println(names.size());

		names.add("Ana");

		System.out.println(names);
		
		String ana = names.get(2);
		System.out.println(ana);
		int idx = names.indexOf("Florin");
		System.out.println("idx = " + idx);
		int lastIdx = names.lastIndexOf(ana);
		System.out.println("lastIdx = " + lastIdx);
		names.set(0, "Corneliu");
		System.out.println(names);
		names.remove(2);
		System.out.println(names);
		names.clear();
		System.out.println(names.size());
		System.out.println(names);
		
		

	}
	
	public static int maxFreq(String str) {
		ArrayList<Character> counter = new ArrayList<>();
		for (int i = 0; i < counter.size(); i++) {
			
		}
	}

}
