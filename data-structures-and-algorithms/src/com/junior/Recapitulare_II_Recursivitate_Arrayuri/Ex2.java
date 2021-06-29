package com.junior.Recapitulare_II_Recursivitate_Arrayuri;

public class Ex2 {

	public static void main(String[] args) {
		
		myMathPow(2, 6);
		myMathPow(3, 4);
		System.out.println(myMathPowR(2, 6));
		System.out.println(myMathPowR(3, 4));

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

}
