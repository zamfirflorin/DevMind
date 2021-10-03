package com.junior.LinkedList;

public class TestOrderedList {
	  public static void main(String[] args) {
	 
	    OrderedList<Town> orderedTownsList = new OrderedList<>();
	 
	    // populate list with towns:
	    orderedTownsList.addInOrderedList(new Town("Suceava", 200));
	    orderedTownsList.addInOrderedList(new Town("Cluj", 350));
	    orderedTownsList.addInOrderedList(new Town("Targu Jiu", 150));
	    orderedTownsList.addInOrderedList(new Town("Bucuresti", 220));
	    orderedTownsList.addInOrderedList(new Town("Brasov", 100));
	    orderedTownsList.addInOrderedList(new Town("Bacau", 90));
	 
	    System.out.println(orderedTownsList);
	    
	    System.out.println(orderedTownsList.countOccurrencesIter( orderedTownsList.getElements(), "Suceava"));
	    System.out.println(orderedTownsList.countOccurrences( orderedTownsList.getElements(), "Suceava"));
	    
	  }
	}
