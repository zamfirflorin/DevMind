package com.florin.Recapitrulare;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex1 {


	
	public static void main(String[] args) throws UnknownHostException {

/*		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int exp = sc.nextInt();
		
		for (int i = 0; i <= exp; i++) {
			System.out.print((int)Math.pow(n, i) + " ");
		}*/
		
/*		System.out.println(complement(123));
		System.out.println(complement(9));
		System.out.println(complement(12));
		System.out.println(complement(677));
		showPalindrom(121);
		showPalindrom(444424444);
		showPalindrom(123);
		
		int[] arr = new int[] {2, 15, 10, 353, 1481, 81, 3, 5, 7, 0, 22};
		
		for (int n: arr) {
			if (isPrime(n)) {
				System.out.println(n + " Este numar prim");
			} else {
				System.out.println(n + " Nu este numar prim");
			}
			
		}*/
		
/*		int[] arr1 = new int[] { -1, 4, 11, 101};
		int[] arr2 = new int[] { 15 };
		int[] arr3 = new int[] { 0, 0, 0, 1, 1 };
		int[] arr5 = new int[] {10, 4, 8, 11, 15, 0};
		
		esteCrescator(arr1);
		esteCrescator(arr2);
		esteCrescator(arr3);
		esteCrescator(arr5);*/

		//System.out.println(primeFactors(13));
/*		System.out.println(areFriendly(284, 220));
		printAmicale(1, 10_000);*/
		
		
/*		biggestFiveMultiple(20);
		biggestFiveMultiple(18);
		biggestFiveMultiple(1);
		biggestFiveMultiple(4);
		biggestFiveMultiple(11);
		biggestFiveMultiple(39);*/
		//primeNumbersSum(20);
		
		//showFibonacciContainingThree(46368);
		
/*		tripletPitagoreic(30);
		
		InetAddress myip = InetAddress.getLocalHost();
		System.out.println(myip);*/
		
		

		
		double[] arr = new double[] {1, 3, 0, 4, 2.25};
		processArray(arr);
		System.out.println(arr[0]);
	}
	
	public static int complement(int n) {
		int exp = 0;
		int aux = n;
		int pow = 1;
		while (aux > 0) {
			exp++;
			aux /= 10;
		}
		while (exp > 0) {
			pow *= 10;
			exp--;
		}
		return pow - n;
		/*return (int) Math.pow(10, exp) - n;*/
	}
	
	public static void showPalindrom(int n) {
		int aux = n;
		int reverse = 0; 
		
		while (aux > 0) {
			int lastDigit = aux % 10;
			reverse = reverse * 10 + lastDigit;
			aux /= 10;
		}
		if (reverse == n) {
			System.out.println("Numarul " + n + " este palindrom");
		} else {
			System.out.println("Nu este palindrom");
		}
	}
	
	//Numere prime, divizori, descompunere
	
	public static boolean isPrime(int n) {

		if (n < 2) {
			return false;
		} else if (n == 2) {
			return true;
		}
		if (n % 2 == 0) {
			return false;
		}
		
		for (int i = 3; i < n / 2; i+=2) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void showDiv(int n) {
		if (!isPrime(n)) {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println(n + " este numar prim!");
		}
	}
	
	public static String primeFactors(int n) {
		String str = "";
		int initNumber = n;
		
		for (int i = 2; i <= initNumber; i++) {
			
			int counter = 0;
			while (n % i == 0) {
				counter++;
				n = n / i;		
			}
			
			if (counter != 0) {
				str +=  i + "^" + counter + "*";
			}
			
			if (n == 1) {
				break;
			}
			
		}
		return str;
	}
	
	public static int divisorsSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static boolean areFriendly(int first, int second) {
		int sumFirst = divisorsSum(first);
		int sumSecond = divisorsSum(second);
		return sumFirst == second && sumSecond == first;
	}
	
	public static void printAmicale(int lower, int upper) {
		
		for(int i = lower; i <= upper; i++) {
			for(int k = i+1; k <= upper; k++) {
				if (areFriendly(i, k)){
					System.out.println(i + " " + k);
				}
			}
		}	
	}
	
	//5. (Bonus) Sir crescator
	
	public static boolean isCrescator(int[] arr) {
		boolean flagged = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i+1] < arr[i]) {
				flagged = false;
				break;
			}
		}
		return flagged;
	}
	
	public static void esteCrescator(int[] arr) {
		if (isCrescator(arr)) {
			System.out.println("Sir crescator");
		} else {
			System.out.println("Nu este sir crescator");
		}
	}
	
	//1. Scrie o metoda care primeste ca parametru un numar natural n si returneaza cel mai mare multiplu de 5, mai mic sau egal cu n. 
	//Testeaza metoda in main cu diverse cazuri de exceptie:
	
	public static int biggestFiveMultiple(int n) {
		int multiple = 0;
		
		for (int i = 0; i <= n; i++) {
			if (i % 5 == 0 && i >= multiple) {
				multiple = i;
			}
		}
		System.out.println(multiple);
		return multiple;
	}
	
	public static void primeNumbersSum(int upperLimit) {
		int counter = 0;
		int initCapacity = 1;
		int[] arr = new int[initCapacity];
		int sum = 0;
		for (int i = 2; sum < upperLimit; i++) {
			if (isPrime(i)) {
				sum += i;
				
				if (counter == arr.length) {
					arr = Arrays.copyOf(arr, arr.length*2);	
				}
				if (sum > upperLimit) {
					break;
				}
				arr[counter] = sum;
				counter++;
			}
		}
		arr = Arrays.copyOf(arr, counter);
		for (int n : arr) {
			System.out.print(n + " ");
			
		}
		System.out.println("\n"	+ arr.length);
	}
	
	public static void showFibonacciContainingThree(int upperLimit) {
		int limit;
		for (int i = 1; i <= upperLimit; i++) {
			int n = fibonacci(i);
			if (n > upperLimit) {
				break;
			}
			if (containsThree(n)) {
				System.out.println(n);
			}
		}

	}
	
	public static int fibonacci(int n) {
		    // Pentru cazurile de baza, solutia nu trebuie calculata
		    // recursiv, deoarece aceasta este cunoscuta a priori.
		    // Prin urmare, va fi returnata direct.
		    if (n == 1 || n == 2) {
		      return 1;
		    }
		 
		    // fibonacci(n) = fibonacci(n-2) + fibonacci(n-1)
		    return fibonacci(n-2) + fibonacci(n-1);
	}
	
	public static boolean containsThree(int n) {
		boolean isThree = false;
		while (n != 0) {
			if (n % 10 == 3) {
				isThree = true;
				break;
			}
			n /= 10;
		}
		return isThree;
	}
	
	public static void tripletPitagoreic(int upperLimit) {
		
		for(int i = 1; i < upperLimit; i++) {
			for (int k = i + 1; k <= upperLimit; k++) {
				for (int j = 1; j <= upperLimit; j++) {
					int i2 = i * i;
					int k2 = k * k;
					int j2 = j * j;
					if (i2 + k2 == j2) {
						System.out.println(i + " " + k + " " + j);
					}
				}
			}
		}
		
	}
	// 15382
	public static boolean zigZag(int n) {
		int[] arr = intToDigitsArr(n);
		boolean flagged = false;
		for (int i = 0; i < arr.length-2; i++) {
			if (arr[i] < arr[i+1] && arr[i+1] > arr[i+2]) {
				flagged = true;
			} else if (arr[i] > arr[i+1] && arr[i+1] < arr[i+2]) {
				flagged = true;
			} else {
				flagged = false;
			}
		}
		return flagged;
	}
	public static int reverse(int n) {
		int aux = n;
		int reversed = 0;
		while (aux != 0) {
			int lastDigit = aux % 10;
			reversed = reversed * 10 + lastDigit;
			aux /= 10;
		}
		return reversed;
	}
	public static int numberDigits(int n) {
		int counter = 0;
		while (n != 0) {
			counter++;
			n /= 10;
		}
		return counter;
	}
	public static int[] intToDigitsArr(int n) {
		int[] arr = new int[numberDigits(reverse(n))];
		int counter = 0;
		while (n != 0) {
			arr[counter] = n % 10;
			counter++;
			n /= 10;
		}
		return arr;
	}
	
	public static void processArray(double[] array) {
		for (int i=1; i < array.length; i++) {
			if (i % 2 != 0) {
				continue;
			}
			array[0] += array[i];
		}
	}
	

}
