package com.junior.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Test {

public static boolean isPalindrome(int x) {
    int num = 0;
    int copyX = x;
    while (copyX > 0){
    	System.out.println("1. num is " + num);
        num += copyX % 10;
        System.out.println("2. num is " + num);
        num *= 10;
        copyX /= 10;
        System.out.println("3. num is " + num);
        System.out.println("4. copy x is "  + copyX);
    }

    System.out.println("final num is " + num);
    return x == num;
}
//2147483647
//1410065418
//1000000000

public static void main(String[] args) {	

	System.out.println(isPalindrome(1000000001));
}
}
