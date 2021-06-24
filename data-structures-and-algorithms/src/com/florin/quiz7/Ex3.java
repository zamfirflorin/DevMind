package com.florin.quiz7;

import java.util.Scanner;

public class Ex3 {


	  public static void displayNumberRec(long value) {
		    if (value < 9) {
		      System.out.print(value);
		      return;
		    }
		    displayNumberRec(value / 10);
		    System.out.print(value % 10);
		  }
		 
		  public static void displayNumber(long value) {
		    formatNumber(value/1000);
		    System.out.print('.');
		    displayNumberRec(value % 1000);
		  }
		 
		  public static void formatNumber(long value) {
		    if (value > 1000) {
		      displayNumber(value);
		    } else {
		      displayNumberRec(value);
		    }
		  }
		 
		  public static void main(String[] args) {
		    formatNumber(214725492);
		  }

		  
}
