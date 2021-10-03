package com.junior.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTema {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList();
		
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(9);
		list.add(9);
		list.add(10);
		
		printList(list);
		removeDuplicates2(list);
		printList(list);
	
	}
	
	public static void printList(LinkedList<Integer> list) {
		Iterator<Integer> it = list.iterator();

		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}
	
	
	public static void removeDuplicates(LinkedList<Integer> list) {
		int firstIndex = 0;
		int secondIndex = 1;
		int lastIndex = list.lastIndexOf(list.getLast());
		
		while (secondIndex <= lastIndex) {
			if (list.get(firstIndex) == list.get(secondIndex)) {
				list.remove(secondIndex);
				lastIndex--;
			} else {
				firstIndex++;
				secondIndex++;
			}
		}
		
	}
	
	public static void removeDuplicates2(LinkedList<Integer> list) {
		int firstIndex = 0;
		int secondIndex = 1;
		int lastIndex = list.lastIndexOf(list.getLast());
		
		while (secondIndex <= lastIndex) {
			if (list.get(firstIndex) == list.get(secondIndex)) {
				list.remove(firstIndex);
				list.remove(firstIndex);
				lastIndex--;
				lastIndex--;
			} else {
				firstIndex++;
				secondIndex++;
			}
		}
		
	}
	
	

}
