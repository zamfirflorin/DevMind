package com.junior.Recapitulare_II_Recursivitate_Arrayuri;

import java.util.Arrays;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1, 2, 0, -5};
		int[] b = new int[] {0, 2, 1, 0, -1, 14, 0, -6};
		int[] acopy = cerneZerouri(a);
		int[] bcopy = cerneZerouri(b);
		
		cerneZerouriOptimizat(a);
		System.out.println();
		cerneZerouriOptimizat(b);

	}
	// Cerne zero-uri
	public static void cerneZerouriOptimizat(int[] a) {
		int i = a.length - 1; //pe ce pozitie suntem
		int k = a.length - 1; //pe ce pozitie scriem
		int cnt = 0;
		while (i >= 0) {
			if (a[i] == 0) {
				--i;
				cnt++;
				continue;
			}
			a[k] = a[i];
			i--;
			k--;
		}

		while (cnt != 0) {
			a[k] = 0;
			cnt--;
			k--;
		}
		for (int n : a) {
			System.out.print(n + " ");
		}
		
	}
	
	//mysolution
	public static int[] cerneZerouri(int[] arr) {
		int countZeros = 0;
		int countOtherDigits = 0;
		int[] arrZeros = new int[1];
		int[] arrOthers = new int[1];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				if(arrZeros.length == countZeros)
					arrZeros = Arrays.copyOf(arrZeros, arrZeros.length * 2);
					arrZeros[countZeros] = arr[i];
					countZeros++;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				if(arrOthers.length == countOtherDigits) {
					arrOthers = Arrays.copyOf(arrOthers, countOtherDigits * 2);
					arrOthers[countOtherDigits] = arr[i];
					countOtherDigits++;
				}
				
			}	
		}
		arrZeros = Arrays.copyOf(arrZeros, countZeros);
		arrOthers = Arrays.copyOf(arrOthers, countOtherDigits);
		int[] result = new int[countZeros + countOtherDigits];
		for (int i = 0; i < arrZeros.length; i++) {
			result[i] = arrZeros[i];
		}
		for (int i = countZeros ; i < arrOthers.length; i++) {
			result[countZeros] = arrOthers[i];
			countZeros++;
		}
		return result;
	}

}
