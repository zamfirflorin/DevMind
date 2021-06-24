package com.florin.curs18_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TemaArrays_C18 {

	public static void main(String[] args) {
		
		int[] arrayA = new int[]{ 2, 100, 4, 18, 23, 432};
		int[] arrayB = new int[]{1, 9, 15, 100, 98, 18, 34, 44};
		
		int[] aMinusB = substractArrays(arrayA, arrayB);
		int[] intersectAB = intersection(arrayA, arrayB);
		int[] unionAB = union(arrayA, arrayB);
		
		printElements(arrayA);
		printElements(arrayB);
		printElements(aMinusB);
		printElements(intersectAB);
		printElements(unionAB);
	}
	
	// Exercitiul 1
	public static int[] readArray() {
		Scanner sc = new Scanner(System.in);
		int stopKeyword = -1;
		int initCapacity = 4;
		int[] array = new int[initCapacity];
		int numberOfElements = 0; 
		
		int read = sc.nextInt();
		
		while (read != stopKeyword) {
			array[numberOfElements] = read;
			numberOfElements++;
			
			if (numberOfElements == array.length) {
				array = Arrays.copyOf(array, array.length * 2);
			}
			read = sc.nextInt();
		}
		sc.close();
		return Arrays.copyOf(array, numberOfElements);
	}
	
	//Exercitiul 1 
	public static int[] substractArrays(int[] arrayA, int[] arrayB) {
		int numberOfElements = 0;
		int[] result = new int[numberOfElements+1];

		for (int i = 0; i < arrayA.length; i++) {
			boolean existsInB = false;
			for (int k = 0; k < arrayB.length; k++) {
				if (arrayA[i] == arrayB[k]) {
					existsInB = true;
				}				
			}	
			if (!existsInB) {
				if (numberOfElements == result.length) {
					result = Arrays.copyOf(result, result.length+1);
				}
				result[numberOfElements] = arrayA[i];
				numberOfElements++;
			}
		}
		return result;
	}
	
	public static void printElements(int[] array) { 
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	//Exercitiul 2.1
	public static int[] intersection(int[] arrayA, int[] arrayB) {
		int numberOfElements = 0;
		int[] result = new int[numberOfElements+1];
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayB.length; j++) {
				if (arrayA[i] == arrayB[j]) {
					if (numberOfElements == result.length) {
						result = Arrays.copyOf(result, result.length+1);
					}
					result[numberOfElements] = arrayA[i];
					numberOfElements++;
				}
			}
		}
		
		return result;
	}

	//Exercitiul 2.2
	public static int[] union(int[] arrA, int[] arrB) {
		int nbElements = arrB.length;
		int[] result = Arrays.copyOf(arrB, arrB.length);
		
		for (int i = 0; i < arrA.length; i++) {
			boolean existsInB = false;
			for (int k = 0; k < arrB.length; k++) {
				if (arrA[i] == arrB[k]) {
					existsInB = true;
				}
			}
			if (!existsInB) {
				if (nbElements == result.length) {
					result = Arrays.copyOf(result, result.length+1);	
				}
				result[nbElements] = arrA[i];
				nbElements++;
			}
		}
		return result;
	}

}
