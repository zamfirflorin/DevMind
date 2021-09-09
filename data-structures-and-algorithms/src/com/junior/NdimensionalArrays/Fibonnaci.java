package com.junior.NdimensionalArrays;

public class Fibonnaci {

	public static void main(String[] args) {
		
		System.out.println(fib(48));
		System.out.println(iterFib(48));
		System.out.println(getNthFib(48));
		

	}
	 public static int fib(int n) {
		 return fib(n, new int[(int) (n+1)]);
	 }
	 
	 public static int fib (int i, int[] memo) {
		 if (i == 0 || i == 1) return i;
		 if (memo[(int) i] == 0) {
			 memo[(int) i] = fib(i - 1, memo) + fib(i - 2, memo);  
		 }
		 return memo[(int) i];
	 }
	 
	 //O (2^n) time || O(N) space
	 public static int getNthFib(int n) {
			if (n == 1 || n == 0) return n;
			if (n == 2) return 1;
			return getNthFib(n - 1) + getNthFib(n - 2);
	 }
	 
	 public static int iterFib(int n) {
	    int[] lastTwo = {0, 1};
			int counter = 2;
			
			while (counter <= n) {
				
				int last = lastTwo[0] + lastTwo[1];
				lastTwo[0] = lastTwo[1];
				lastTwo[1] = last;
				counter++;
				
			}
			if (n == 1) {
				return lastTwo[0];
			}
			else {
				return lastTwo[1];		
			}
	  }
}
