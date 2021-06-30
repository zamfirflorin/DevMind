package com.junior.Recapitulare_II_Recursivitate_Arrayuri;

public class Ex4_BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = new int[] {2, 10, 784, 17, 90, 418};
		bubbleSort(arr);
		for (int n : arr) {
			System.out.print(n + " ");
		}

	}
	
	//bubble sort optimizat
	static void bubbleSort(int[] arr) {
		int k = arr.length;
		while (k > 0) {
			boolean changed = false;
			for (int i = 0; i < k - 1; i++) {
				if (arr[i] > arr[i+1]) {
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
					changed = true;
				}
			}
			if (changed == false) {
				break;
			}
			k--;
		}
	}

}
