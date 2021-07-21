package com.junior.ArrayLists;

public class Main {

	public static void main(String[] args) {
		int[] firstArr = new int[] {1, 6, 2, 3, 4, 5, 6};
		int[] secondArr = new int[] {6, 7, 8, 9, 10};
		int[] thirdArr = new int[] {0, 0, 0, 0};
		MyIntArrayList myList = new MyIntArrayList();
		MyIntArrayList auxList = new MyIntArrayList();
		MyIntArrayList thirdList = new MyIntArrayList();
		myList.printElements();
		myList.getCapacity();
		myList.ensureCapacity(1);
		myList.getCapacity();
		System.out.println("first add with index and element");
		System.out.println("\nSize of the list : " + myList.size());
		myList.add(0, 14);

		myList.printElements();
		myList.add(1, 15);
		myList.printElements();
		System.out.println("\nsecond add with first array elements");
		for (int i = 0; i < firstArr.length; i++) {
			myList.add(firstArr[i]);
		}
		for (int i = 0; i < secondArr.length; i++) {
			auxList.add(secondArr[i]);
		}
		for (int i = 0; i < thirdArr.length; i++) {
			thirdList.add(thirdArr[i]);
		}
		myList.printElements();
		System.out.println("\nSize of the list : " + myList.size());
		System.out.println("\nsecond add with second array elements");
		for (int i = 0; i < secondArr.length; i++) {
			myList.add(secondArr[i]);
		}
		myList.printElements();
		System.out.println("\nSize of the list : " + myList.size());
		myList.contains(8);
		
		System.out.println("\n=====================\nTesting get method");
		int myInt = myList.get(0);
		int mySecondInt = myList.get(11);
		int myThirdInt = myList.get(10);
		
		System.out.println(myInt);
		System.out.println(mySecondInt);
		System.out.println(myThirdInt);
		System.out.println("\n=====================\nTesting indexOf method");
		System.out.println(myList.indexOf(14));
		System.out.println(myList.indexOf(0));
		System.out.println("\n=====================\nTesting lastIndexOf method");
		System.out.println(myList.lastIndexOf(14));
		System.out.println(myList.lastIndexOf(0));
		System.out.println(myList.lastIndexOf(6));
		System.out.println("\n=====================\nTesting remove method");
		myList.printElements();
		myList.getCapacity();
		System.out.println("Size = " + myList.size());
		System.out.println(myList.remove(14));
		myList.printElements();
		myList.getCapacity();
		System.out.println("Size = " + myList.size());
		
		System.out.println(myList.remove(6));
		myList.printElements();
		myList.getCapacity();
		
		System.out.println(myList.remove(6));
		myList.printElements();
		myList.getCapacity();
		
		System.out.println(myList.remove(10));
		myList.printElements();
		myList.getCapacity();
		
		System.out.println("\n=====================\nTesting remove element at index method");
		myList.printElements();
		myList.getCapacity();
		System.out.println("Size = " + myList.size());
		System.out.println(myList.removeElementAtIndex(6));
		myList.printElements();
		myList.getCapacity();
		System.out.println("Size = " + myList.size());
		
		/*
		 * System.out.println("\n=====================\nTesting clear method");
		 * myList.printElements(); myList.getCapacity(); myList.clear();
		 * System.out.println("\nAfter method"); myList.printElements();
		 * myList.getCapacity();
		 */
		
		System.out.println("\n=====================\nTesting set method");
		myList.printElements();
		myList.getCapacity();
		myList.set(0, 9);
		System.out.println("\nAfter method");
		myList.printElements();
		myList.getCapacity();
		
		System.out.println("\n=====================\nTesting addAll method");
		myList.printElements();
		myList.getCapacity();
		myList.addAll(auxList);
		System.out.println("\nAfter method");
		myList.printElements();
		myList.getCapacity();
		
		
		System.out.println("\n=====================\nTesting addAll with index method");
		myList.printElements();
		myList.getCapacity();
		myList.addAll(13, thirdList);
		System.out.println("\nAfter method");
		myList.printElements();
		myList.getCapacity();
		
	}

}
