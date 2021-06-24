package com.florin.workshopTwo.partOne;

public class Ex5_Fibonacci {

	public static void main(String[] args) {
		
		System.out.println(fibonacci(8));
		printFibonnaci(26);
		isFibonnaci(100);
		isFibonnaci(2);
		isFibonnaci(1);
		isFibonnaci(89);
		isFibonnaci(144);
		isFibonnaci(150);
		isFibonnaci(2176312);


	}
	
	public static int fibonacci(int n) {
		if (n == 1 || n <= 2) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}

	public static void printFibonnaci(int n) {
		System.out.print(n + " -> ");
		
		for (int i = 1; i <= n; i++) {
			
			if(fibonacci(i) >= n){
				break;
			}
			System.out.print(fibonacci(i) + " ");

		}
		System.out.println();
	}
	
	public static boolean isFibonnaci(int n) {
		boolean bool = false;

		

		
		for (int i = 0; i <= n; i++) {
			
			if (i <= 2) {
				bool = true;
				
				break;
			}
			
			int fibo = fibonacci(i);

			if(fibo == n) {
				bool = true;

				break;
			} 
			
			if (fibo > n) {
				break;
			}
			
		}
		System.out.println(n + " -> " + bool);
		return bool;
		
	}

}
