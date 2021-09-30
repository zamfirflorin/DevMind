package com.junior.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class TestOrderedList {
	  public static void main(String[] args) {
	 
	    LinkedList<String> orderedTownsList = new LinkedList<>();
	 
	    // populate list with towns:
	    orderedTownsList.add("Suceava");
	    orderedTownsList.add("Cluj");
	    orderedTownsList.add("Targu Jiu");
	    orderedTownsList.add("Bucuresti");
	 
	    System.out.println(orderedTownsList);
	 
	    orderedTownsList.add("Brasov");
	    orderedTownsList.add("Bacau");
	    orderedTownsList.add("Suceava");
	    orderedTownsList.add("Bucuresti");
	    orderedTownsList.add("Brasov");
	    orderedTownsList.add("Brasov");
	 
	    System.out.println(orderedTownsList);
	    
	    IteratorExample.iterate(orderedTownsList);
	  }
	}
