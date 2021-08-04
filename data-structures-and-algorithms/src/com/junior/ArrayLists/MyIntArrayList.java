package com.junior.ArrayLists;

import java.util.Arrays;

public class MyIntArrayList {

	private int[] elements;
	private int size;

	public MyIntArrayList() {
		this(10);
	}

	public MyIntArrayList(int initialCapacity) {
		this.elements = new int[initialCapacity];
	}

	public MyIntArrayList(MyIntArrayList c) {
		this.elements = c.elements;
	}

	public void add(int index, int element) {

		if (index < 0 || index >= this.elements.length) {

			//throw new IndexOutOfBoundsException();
			System.out
					.println("Throwing IndexOutOfBoundsException when trying to" + " add element at position " + index);
			return;
			
		}
		if (this.size == this.elements.length) {
			elements = Arrays.copyOf(this.elements, this.size * 2);
		}
		for (int i = this.size; i > index; i--) {
			elements[i] = elements[i - 1];
		}
		elements[index] = element;
		this.size++;
		//elements = Arrays.copyOf(this.elements, size);
	}

	public boolean add(int e) {
		if (this.size == this.elements.length) {
			this.elements = Arrays.copyOf(this.elements, this.size * 2);
		}

		this.elements[size] = e;
		this.size++;
		//this.elements = Arrays.copyOf(elements, size);
		return true;
	}

	public int size() {
		return this.size;
	}

	public boolean contains(int e) {
		boolean check = false;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == e) {
				check = true;
			}
		}
		System.out.println("Contains " + e + " " + check);
		return check;
	}

	public int get(int index) {
		if (index < 0 || index >= this.size) {
			//throw new IndexOutOfBoundsException();
			System.out.println(
					"Throwing IndexOutOfBoundsException when trying to" + " get element at position " + index);
			return -1;
		}
		return this.elements[index];
	}

	public int indexOf(int e) {
		for (int i = 0; i < this.size; i++) {
			if (this.elements[i] == e) {
				return i;
			}
		}
		return -1;
	}

	public int lastIndexOf(int e) {
		int lastIndex = -1;
		for (int i = 0; i < this.size; i++) {
			if (this.elements[i] == e) {
				lastIndex = i;
			}
		}
		return lastIndex;
	}

	public boolean remove(int e) {
		System.out.println("\nRemoving... " + e);
		boolean removed = false;
		for (int i = 0; i < this.size; i++) {
			if (elements[i] == e) {
				removeElementAtIndex(i);
				return true;
			}
		}
		return removed;
	}

	public int removeElementAtIndex(int index) {
		if (index < 0 || index >= this.size) {
			// should throw IndexOutOfBoundsException
			System.out.println(
					"Throwing IndexOutOfBoundsException when trying to" + " remove element at position " + index);
			return -1;
		}

		int removedElement = this.elements[index];
		int length = elements.length - (index == 0 ? 1 : index + 1);
		int lastElement = elements[elements.length - 1];
		for (int i = 0; i < length; i++) {
			elements[index] = elements[index + 1];
			index++;
		}
		this.size--;
		this.elements = Arrays.copyOf(elements, size);

		return removedElement;
	}

	public void clear() {
		this.size = 0;
		this.elements = Arrays.copyOf(elements, size);

	}

	public int set(int index, int e) {
		if (index < 0 || index >= this.size) {
			//throw new IndexOutOfBoundsException();
			System.out.println("Throwing IndexOutOfBoundsException when trying to set" + " the element " + e
					+ " at position " + index);
			return -1;
		}

		int replacedElement = this.elements[index];
		this.elements[index] = e;
		return replacedElement;
	}

	public boolean addAll(MyIntArrayList c) {
		for (int i = 0; i < c.size; i++) {
			add(c.get(i));
		}
		return true;
	}

	public boolean addAll(int index, MyIntArrayList c) {
		elements = Arrays.copyOf(elements, elements.length + c.elements.length);
		int limit = c.elements.length + index;
		for (int i = elements.length - 1 ; i >= limit; i--) {
			elements[i] = elements[i - c.elements.length];
		}
		int cIdx = 0;
		for (int i = index; i < limit; i++) {
			elements[i] = c.elements[cIdx];
			cIdx++;
		}
		return true;
	}

	public int[] toArray() {
		return Arrays.copyOf(elements, elements.length);
	}

	public void ensureCapacity(int minCapacity) {

			this.elements = Arrays.copyOf(this.elements,  minCapacity);
			
		
	}
	
	public void trimToSize() {
		this.elements = Arrays.copyOf(elements, size);
	}

	public void printElements() {
		System.out.print("\nList elements: ");
		for (int i = 0; i < size; i++) {
			System.out.print(elements[i] + " ");
		}
	}
	public void getCapacity() {
		System.out.println("\nCapacity = "+elements.length);
	}


}