package com.devmind.passbyvalue;

import java.util.HashMap;

public class ShapesIndexing {
	  public static int computeResult(String[] shapes) {
	    HashMap<String, Integer> index = new HashMap<>();
	    int result = shapes.length > 0 ? 1 : 0;
	    for (int i=0; i<shapes.length; i++) {
	      if (index.containsKey(shapes[i])) {
	        int newVal = index.get(shapes[i]) + 1;
	        index.put(shapes[i], newVal);
	        result = result > newVal ? result : newVal;
	      } else {
	        index.put(shapes[i], 1);
	      }
	    }
	    return result;
	  }
	 
	  public static void main(String[] args) {
	    String[] shapes = {"triangle", "rectangle", "circle", "oval", "sphere", 
	                       "rectangle", "square", "rectangle", "circle"};
	    System.out.println(computeResult(shapes));
	  }
	}