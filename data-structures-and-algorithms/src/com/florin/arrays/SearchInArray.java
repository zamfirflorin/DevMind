package com.florin.arrays;

public class SearchInArray {
	 
	  public static boolean search(String[] array, String value) {
	    for (int i=0; i<array.length; i++) {
	      if (array[i].equals(value)) {
	        return true;
	      }	
	    }
	    return false;
	  }
	 
	  public static void main(String[] args) {
	    String[] names = {"Anna", "John", "Alice", "Bob", "Daisy", "Serena"};
	 
	    System.out.println("Is name \"Lucy\" in the array? - " + search(names, "Lucy"));
	    System.out.println("Is name \"Serena\" in the array? - " + search(names, "Serena"));
	    System.out.println("Is name \"Bob\" in the array? - " + search(names, "Bob"));
	    System.out.println("Is name \"Mark\" in the array? - " + search(names, "Mark"));
	    System.out.println("Is name \"daisy\" in the array? - " + search(names, "daisy"));
	  }
	}