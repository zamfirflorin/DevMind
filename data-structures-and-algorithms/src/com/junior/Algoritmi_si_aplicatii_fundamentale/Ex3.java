package com.junior.Algoritmi_si_aplicatii_fundamentale;
//Multiplu de 5
public class Ex3 {

	public static void main(String[] args) {
		System.out.println(getMultipleOf5Lower(20));
		System.out.println(getMultipleOf5Lower(18));
		System.out.println(getMultipleOf5Lower(1));
		System.out.println(getMultipleOf5Lower(4));
		System.out.println(getMultipleOf5Lower(11));
		
		System.out.println();
		
		System.out.println(getMultipleOf5Upper(20));
		System.out.println(getMultipleOf5Upper(18));
		System.out.println(getMultipleOf5Upper(1));
		System.out.println(getMultipleOf5Upper(4));
		System.out.println(getMultipleOf5Upper(11));
		System.out.println(getMultipleOf5Upper(0));

	}

	
	//a
	public static int getMultipleOf5Lower(int n) {
		if (n % 5 == 0) {
			return n;
		}
		return n - (n % 5);
	}
	
	//b
	public static int getMultipleOf5Upper(int n) {
		if (n % 5 == 0) {
			return n;
		}
		return n + (5 - (n % 5));
	}	

}
