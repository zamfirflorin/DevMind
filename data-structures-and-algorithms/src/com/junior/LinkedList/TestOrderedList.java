package com.junior.LinkedList;

public class TestOrderedList {
	  public static void main(String[] args) {
	 
	    OrderedList<String> orderedTownsList = new OrderedList<>();
	 
	    // populate list with towns:
	    orderedTownsList.addInOrderedList("Suceava");
	    orderedTownsList.addInOrderedList("Cluj");
	    orderedTownsList.addInOrderedList("Targu Jiu");
	    orderedTownsList.addInOrderedList("Bucuresti");
	 
	    System.out.println(orderedTownsList);
	 
	    orderedTownsList.addInOrderedList("Brasov");
	    orderedTownsList.addInOrderedList("Bacau");
	    orderedTownsList.addInOrderedList("Suceava");
	    orderedTownsList.addInOrderedList("Bucuresti");
	    orderedTownsList.addInOrderedList("Brasov");
	    orderedTownsList.addInOrderedList("Brasov");
	 
	    System.out.println(orderedTownsList.countOccurrencesIter( orderedTownsList.getElements(), "Suceava"));
	    System.out.println(orderedTownsList.countOccurrences( orderedTownsList.getElements(), "Suceava"));
	    
	  }
	}
