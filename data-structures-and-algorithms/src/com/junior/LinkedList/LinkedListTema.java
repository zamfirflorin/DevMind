package com.junior.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTema {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(9);
		list.add(10);
		list.add(10);
		list.add(11);
		list.add(11);
		list.add(11);
		System.out.print("intput : ");
		printList(list);
		//removeDuplicates2(list);
		removeDuplicates(list);
		System.out.print("result : ");  
		printList(list);
	}
	
	public static void printList(LinkedList<Integer> list) {
		Iterator<Integer> it = list.iterator();

		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}
	
	
	public static void removeDuplicates2(LinkedList<Integer> list) {
		ListIterator<Integer> it = (ListIterator<Integer>) list.iterator();
		int first;
		int second = 0;
		

		while (it.hasNext()) {
			first = it.next();

			if (it.hasNext()) {
				second = it.next();

				if (first == second) {
					it.previous();
					it.previous();
					it.remove();
					second = it.next();
					it.previous();
					while (it.hasNext() && second == it.next()) {
						it.remove();
						
					}
					it.previous();
					
				}
				if (it.hasPrevious()) {
				it.previous();
				}
			}
		}
	}
	
	public static void removeDuplicates(LinkedList<Integer> list) {
		ListIterator<Integer> it = (ListIterator<Integer>) list.iterator();
		int first;
		int second = 0;

		while (it.hasNext()) {
			first = it.next();

			if (it.hasNext()) {
				second = it.next();

				if (first == second) {
					it.remove();
				}
				it.previous();
			}

			
		}

	}
	
}
