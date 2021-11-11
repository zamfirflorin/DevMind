package com.junior.test;

public class TapeEquilibrium {

	public static void main(String[] args) {
		int[] arr = new int[] {3, 1, 2, 4, 3}; 
		System.out.println(solution(arr));
	}
	
	//O(2N) time | O(2N) space => O(n) time | O(n) space
    public static int solution(int[] arr) {
    	
      int[] aux = new int[arr.length];
      aux[0] = arr[0];
      for (int i = 1; i < arr.length; i++) {
    	  aux[i] = aux[i-1] + arr[i];
      }
      
      int[] differences = new int[arr.length];
      
      for (int i = 0; i < arr.length - 1; i++) {
    	  int lastElement = aux[aux.length - 1];
    	  differences[i] = Math.abs(lastElement - 2*(aux[i]));
      }
      
      int min = getMinDifference(differences); 
      return min;
    }

	private static int getMinDifference(int[] arr) {
		int min = Integer.MAX_VALUE; 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

}
