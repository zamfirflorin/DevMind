package com.junior.Recapitulare_II_Recursivitate_Arrayuri;

public class Ex2 {

	public static void main(String[] args) {
		
		myMathPow(2, 6);
		myMathPow(3, 4);
		System.out.println(myMathPowR(2, 6));
		System.out.println(myMathPowR(3, 4));
		System.out.println(myMathPowR(3, 3));

	}
	
	//recursiv
	public static long myMathPowR(int x, int y) {
		if (y == 0)  return 1;
		return (long) x * myMathPowR(x, y - 1);
	}
	
	
	//iterativ
	public static long myMathPow(int x, int y) {
		if (y == 0) {
			return 1;
		}
		int pow = 1;
		for(int i = 1; i <= y; i++) {
			pow = pow * x;
		}
		System.out.println(pow);
		return pow;
	}
	//iterativ george
	public static int myMathPowRGeorge(int x, int y) {
		if (y == 0)  return 1;
		if (y % 2 == 1) {
			return x * myMathPowRGeorge(x, y - 1);
		} else {
			int val = myMathPowRGeorge(x, y /2);
			return val * val;
		}
	}
	
	public static boolean checkPalindrom(String s, int left, int right) {
		if (left >= right) return true;
			else {
				return checkPalindrom(s, left + 1, right - 1) && (s.charAt(left) == s.charAt(right));
			}
	}

}
