package com.junior.P3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class RadixSort {
	
	public static void main(String[] args) {
		int[] numbers = {1000, 4, 25, 319, 88, 51, 3430, 8471, 701, 1, 2989, 657, 713};
		ArrayList<String> sortedRadix = radix(numbers);
		for (String str : sortedRadix) {
			System.out.print(str + " ");
		}
	}

	public static ArrayList<String> radix(int[] numbers) {
		ArrayList<String> mainList = new ArrayList<>();
		String[] convertedNumbers = addLeadingZeros(numbers);
		String[] result = addNumbersInQueueDescending(convertedNumbers);
		//String[] result = addNumbersInQueueAscending(convertedNumbers);
		
		for (String str : result) {
			mainList.add(str);
		}
		return mainList;
	}
	
	public static int getLeadingZeros(int[] numbers) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		int counter = 0;
		while (max != 0) {
			counter++;
			max /= 10;
		}
		return counter;
	}
	
	public static String[] addLeadingZeros(int[] numbers) {
		String[] convertedNumbers = new String[numbers.length];
	
		for (int i = 0; i < numbers.length; i++) {
			int numberLength = numberLength(numbers[i]);
			int aux = getLeadingZeros(numbers) - numberLength; 
			String number = "";
			while (aux >= 1) {
				number += "0";
				aux--;
			}
			number += numbers[i];
			convertedNumbers[i] = number;
		}

		return convertedNumbers;
	}
	
	public static int numberLength(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n /= 10;
		}
		return count;
	}
	
	public static String[] addNumbersInQueueAscending(String[] numbers) {
		ArrayList<ArrayDeque<String>> workingQueue = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
        	workingQueue.add(new ArrayDeque<String>());
        }
		for (int k = numbers[0].length() - 1; k >= 0; k--) {
			for (int i = 0; i < numbers.length; i++) {
				int index = Integer.parseInt("" + numbers[i].charAt(k)) % 10;
				workingQueue.get(index).add(numbers[i]);
			}
			int idx = 0;
			for (int i = 0; i < workingQueue.size(); i++) {
				
				while (!workingQueue.get(i).isEmpty()) {
					numbers[idx++] = workingQueue.get(i).removeFirst();
				}
			}
		}
		return numbers;
	}
	
	public static String[] addNumbersInQueueDescending(String[] numbers) {
		ArrayList<ArrayDeque<String>> workingQueue = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
        	workingQueue.add(new ArrayDeque<String>());
        }
		for (int k = numbers[0].length() - 1; k >= 0; k--) {
			for (int i = 0; i < numbers.length; i++) {
				int index = Integer.parseInt("" + numbers[i].charAt(k));
				workingQueue.get(index).add(numbers[i]);
			}
			int idx = 0;
			for (int i = workingQueue.size() - 1; i >= 0 ; i--) {
				
				while (!workingQueue.get(i).isEmpty()) {
					numbers[idx++] = workingQueue.get(i).removeFirst();
				}
			}
		}
		return numbers;
	}
	
}
