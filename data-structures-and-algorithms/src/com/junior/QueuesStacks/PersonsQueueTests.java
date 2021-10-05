package com.junior.QueuesStacks;

public class PersonsQueueTests {

	public static void main(String[] args) {
		PersonsQueue theQueue = new PersonsQueue();
		 
		System.out.println(theQueue.areMorePersons());
		 
		theQueue.addPerson("Andrew");
		theQueue.addPerson("Diana");
		theQueue.addPerson("Lary");
		 
		System.out.println(theQueue.whoIsNext());
		 
		theQueue.addPerson("Amy");
		theQueue.addPerson("Anna");
		 
		theQueue.servePerson();
		 
		System.out.println(theQueue.whoIsNext());
		 
		theQueue.addPerson("Bill");
		 
		while (theQueue.areMorePersons()) {
		  System.out.println(theQueue.servePerson());
		}

	}

}
