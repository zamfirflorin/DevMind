package com.florin.curs21;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
/*		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		
		sc.close();
		*/
		
		String[] myArr = new String[]{"some", "random", "words", "for", "testing"};
		secondWordInArray(myArr);
		lastButOneInArray(myArr);
		

	}
	
	public static String secondWordInArray(String[] arr) {
		String[] auxArr = Arrays.copyOf(arr, arr.length);
		for(int i = 0; i < auxArr.length; i++) {
			for (int j = 0; j < auxArr.length - 1 - i; j++) {
				if (auxArr[j].compareTo(auxArr[j+1]) > 0) {
					String aux = auxArr[j];
					auxArr[j] = auxArr[j+1];
					auxArr[j+1] = aux;
				}
			}
		}
		System.out.println(auxArr[1]);
		return auxArr[1];
		
	}
	
	public static String lastButOneInArray(String[] arr) {
		String[] auxArr = Arrays.copyOf(arr, arr.length);
		for(int i = 0; i < auxArr.length; i++) {
			for (int j = 0; j < auxArr.length - 1 - i; j++) {
				if (auxArr[j].compareTo(auxArr[j+1]) > 0) {
					String aux = auxArr[j];
					auxArr[j] = auxArr[j+1];
					auxArr[j+1] = aux;
				}
			}
		}
		System.out.println(auxArr[auxArr.length -2]);
		return auxArr[auxArr.length -2];
	}

}
