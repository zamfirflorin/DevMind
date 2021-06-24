package com.florin.curs19;

public class Tema_Curs19_Sortare {

	public static void main(String[] args) {
		double[] digits = new double[]{2, 10, 784, 17, 90, 418};
		double[] sorted = bubbleSort(digits);
		String[] strings = new String[]{"ab", "ac", "z", "c", "b"};
		
		bubbleSort(strings);
		for (double n : digits) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		for (double n : sorted) {
			System.out.print(n + " ");
		}
		System.out.println();
		for (String s : strings) {
			System.out.print(s + " ");
		}
		

	}
	
	public static double[] bubbleSort(double[] arr) {
		for (int k = 0; k < arr.length - 1; k++) {
			for (int i = 0; i < arr.length - 1 - k; i++) {
				if (arr[i] > arr[i+1]) {
					double n = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = n;
				}
			}
		}
		return arr;
	}
	
	//compareTo
	public static String[] bubbleSort(String[] str) {	
		for (int i = 0; i < str.length - 1; i++) {
			for (int j = 0; j < str.length - 1 - i; j++) {
				if (str[j].compareTo(str[j+1]) > 0) {
					String aux = str[j];
					str[j] = str[j+1];
					str[j+1] = aux;
				}
			}
		}
		return str;
	}
	

}
