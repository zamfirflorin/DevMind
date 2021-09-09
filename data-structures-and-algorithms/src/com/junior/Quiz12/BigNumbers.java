package com.junior.Quiz12;

import java.util.Arrays;

public class BigNumbers {

	  public static void main(String[] args) {
		    int noTests = 6;
		 
		    int[][] op1 = {{0}, {9, 9}, {9}, {2, 1, 7, 8}, 
		                   {5, 0, 5, 0, 5}, {1, 0, 8, 6, 7, 8, 9, 4, 2, 3, 4}};
		    int[][] op2 = {{1, 0, 1}, {1}, {9, 9, 9, 9}, {5, 9, 6}, 
		                   {5, 5, 0, 5, 0}, {3, 4, 2, 8, 9, 7, 9, 2, 3, 4, 9}};
		    int[][] correct = {{1, 0, 1}, {1, 0, 0}, {1, 0, 0, 0, 8}, {2, 7, 7, 4}, 
		                   {1, 0, 5, 5, 5, 5}, {4, 5, 1, 5, 7, 6, 8, 6, 5, 8, 3}};
		 
		    int total = 0;
		    for (int i = 0; i < noTests; i++) {
		      System.out.println("Test " + (i+1) + ":");
		      String op1S = noToString(op1[i]);
		      String op2S = noToString(op2[i]);
		 
		      BigNumbers bn = new BigNumbers();
		      int[] rez = bn.sum(op1[i], op2[i]);
		 
		      String rezS = noToString(rez);
		      String correctS = noToString(correct[i]);
		      System.out.println(op1S + " + " + op2S + " = " + rezS + " C: " + correctS + 
		                         "......" + (rezS.equals(correctS) ? "OK" : "WRONG"));
		      System.out.println();
		 
		      total += rezS.equals(correctS) ? 1 : 0;
		    }
		 
		    System.out.println("Your total score is: " + total + " / " + noTests);
		    System.out.println(total > 3 ? "You passed! Hurray! :)" : "Sorry.. :(");
		  }

	public int[] sum(int[] op1, int[] op2) {

		op1 = reverse(op1);
		op2 = reverse(op2);

		int len = Math.min(op1.length, op2.length);
		int[] result = new int[Math.max(op1.length, op2.length)];
		
		int carry = 0;
		for (int i = 0; i < len; i++) {
			result[i] = (op1[i] + op2[i] + carry) % 10;
			carry = (op1[i] + op2[i] + carry) / 10;
		}
		if (op1.length > op2.length) {
			for (int i = len; i < op1.length; i++) {
				result[i] = (op1[i] + carry) % 10;
				carry = (op1[i] + carry) / 10;
			}
		} else {
			for (int i = len; i < op2.length; i++) {
				result[i] = (op2[i] + carry) % 10;
				carry = (op2[i] + carry) / 10;
			}
		}

		if (carry != 0) {
			result = Arrays.copyOf(result, result.length + 1);
			result[result.length - 1] = carry;
		}
		
		return reverse(result);

	}

	public int[] sumGeorge(int[] op1, int[] op2) {
		op1 = reverse(op1);
		op2 = reverse(op2);
		int lg = Math.min(op1.length, op2.length);
		int[] rez = new int[Math.max(op1.length, op2.length)];

		int t = 0;
		for (int i = 0; i < lg; ++i) {
			rez[i] = (op1[i] + op2[i] + t) % 10;
			t = (op1[i] + op2[i] + t) / 10;
		}

		if (op1.length > op2.length) {
			for (int i = lg; i < op1.length; ++i) {
				rez[i] = (op1[i] + t) % 10;
				t = (op1[i] + t) / 10;
			}
		} else {
			for (int i = lg; i < op2.length; ++i) {
				rez[i] = (op2[i] + t) % 10;
				t = (op2[i] + t) / 10;
			}
		}

		if (t != 0) {
			rez = Arrays.copyOf(rez, rez.length + 1);
			rez[rez.length - 1] = t;
		}

		return reverse(rez);
	}

	public int[] reverse(int[] a) {
		for (int i = 0; i < a.length / 2; ++i) {
			int aux = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = aux;
		}
		return a;
	}

	public int[] reverseFlorin(int[] arr) {
		int aux = arr.length;
		for (int i = 0; i < arr.length / 2; i++) {
			int value = arr[i];
			arr[i] = arr[aux - i - 1];
			arr[aux - i - 1] = value;
		}
		return arr;

	}

	private static String noToString(int[] no) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < no.length; i++) {
			sb.append(no[i]);
		}
		return sb.toString();
	}
}
