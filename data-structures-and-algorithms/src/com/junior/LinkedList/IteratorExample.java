package com.junior.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class IteratorExample {
	
	private static Scanner scanner = new Scanner(System.in);
	 
	public static void printManual() {
	  System.out.println("Options are:\n" + 
	                        "\t0 - quit\n" + 
	                        "\t1 - next element\n" + 
	                        "\t2 - previous element\n" + 
	                        "\t3 - this list\n");
	}
	 //littile change
	public static void iterate(LinkedList<String> towns) {
	  ListIterator<String> li = towns.listIterator();
	  printManual();
	  boolean moveForward = true;
	 
	  while(true) {
	    int option = scanner.nextInt();
	    switch (option) {
	      case 0:
	        return;
	      case 1:
	      if (!moveForward) {
	    	  moveForward = true;
	    	  if (li.hasNext()) {
	    		  li.next();
	    	  }
	      }
	        if (li.hasNext()) {
	          System.out.println(li.next());
	        }
	        break;
	      case 2:
	    	if (moveForward) {
	    		moveForward = false;
	    		if (li.hasPrevious()) {
	    			li.previous();
	    		}
	    	}
	        if (li.hasPrevious()) {
	          System.out.println(li.previous());
	        }
	        break;
	      case 3:
	        printManual();
	        break;
	      default:
	        System.out.println("Unknown command");
	        printManual();
	        break;
	    }
	  }
	}
	
}
