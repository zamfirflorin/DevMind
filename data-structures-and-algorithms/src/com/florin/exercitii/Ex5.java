package com.florin.exercitii;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//1. Este a cel mai mare numar? Raspuns:
		
		System.out.println("A=" + a);
		System.out.println("B=" + b);
		System.out.println("C=" + c);
		System.out.println();
		
		boolean isATheBiggest = a > b && a > c;
		String ex1 = "Este a cel mai mare numar? Raspuns:" + isATheBiggest;
		System.out.println(ex1);
		
		boolean isBTheSmallest = b < a && b < c;
		String ex2 = "Este b cel mai mic numar? Raspuns:" + isBTheSmallest;
		System.out.println(ex2);
		
		boolean isSumaOfAandBSmallerThanC = (a+b) < c ? true : false;
		String ex3	 = "Este suma numerelor a si b mai mica decat c? Raspuns:" + isSumaOfAandBSmallerThanC;
		System.out.println(ex3);
		
		boolean isCBiggerThanMediaAritmeticaOfAAndB = c > (a+b)/2;
		String ex4 = "Este c mai mare decat media aritmetica dintre a si b? Raspuns:" + isCBiggerThanMediaAritmeticaOfAAndB;
		System.out.println(ex4);
		
		boolean isProductBiggerThanOneHundred = (a*b*c) > 100;
		String ex5 = "Depaseste produsul numerelor valoarea 100? Raspuns:" + isProductBiggerThanOneHundred;
		System.out.println(ex5);
		
		
		boolean isSumOfAandCdivisbleBy2 = (a+c)%2 ==0;
		String ex6 = "Este suma numerelor a si c divizibila cu 2? Raspuns:" + isSumOfAandCdivisbleBy2;
		System.out.println(ex6);
		
		boolean isAMultipleOfB = a%b ==0;
		String ex7 = "Este a multiplu al numarului b? Raspuns:" + isAMultipleOfB;
		System.out.println(ex7);
		
		boolean isBBiggerThanRestOfDivisionOfAToC = a%c > b;
		String ex8 = "Este b mai mare decat restul impartirii lui a la c? Raspuns:" + isBBiggerThanRestOfDivisionOfAToC;
		System.out.println(ex8);
		
		boolean seImparteExactBLaRestulImpartiriiLuiALaC = b%(a%c) == 0;
		String ex9 = "Se imparte exact b la diferenta numerelor a si c? Raspuns:" + seImparteExactBLaRestulImpartiriiLuiALaC;
		System.out.println(ex9);
		
		boolean areTheThreeNumbersEqual = a == c && a==b; 
		String ex10 = "Sunt cele 3 numere egale? Raspuns:" + areTheThreeNumbersEqual;
		System.out.println(ex10);
		
		boolean suntCelPutinDouaNumereEgale = a == c || a==b; 
		String ex11 = "Sunt cel putin doua dintre numere egale (oricare doua)? Raspuns:" + suntCelPutinDouaNumereEgale;
		System.out.println(ex11);
		
		
		
	}

}
