package com.florin.Recapitrulare;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  	/* You can define your own extra methods and fields here */
  
  	public static int balance(int[] array) {
        int even = 0; 
        int odds = 0;
		for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            } else {
                odds++;
            }
        }
        if (even < odds) {
            return -1;
        } else if (even == odds) {
            return 0;
        } else {
            return 1;
        }
    }
  	
	public static int calculeazaBonusAnual(int salariu) {
		int bonus = 1;
		int countFives = howManyDigits(salariu, 5);
		int countNines = howManyDigits(salariu, 9);
		
		if (countFives > countNines) {
			for (int i = 0; i < countFives; i++) {
				bonus *= 10;
			}
		} else {
			for (int i = 0; i < countNines * 2; i++) {
				bonus *=10;
			}
		}
		System.out.println(bonus);
		return bonus;
	}
	
	private static int howManyDigits(int n, int target) {
		int counter = 0; 
		while (n > 0) {
			int lastDigit = n % 10;
			if (lastDigit == target) {
				counter++;
			}
			n /= 10;
		}
		return counter;
	}
  
    public static void main(String[] args) {
        /* Enter your code here. Read data from input (System.in). Print result to output (System.out). */
    	calculeazaBonusAnual(59405);
    	calculeazaBonusAnual(99903);
    }
}