package com.junior.LinkedList;

public class MyDoubleLinkedList<E> {
	
	private DoubleLinkedListNode<E> head = null;
	private DoubleLinkedListNode<E> tail = null;
	private int size = 0;
 
	private int getSize() {
		return size;
	}
 
	MyDoubleLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
 
	MyDoubleLinkedList(MyDoubleLinkedList<E> list) {
		DoubleLinkedListNode<E> copyHead = list.head;
		while (copyHead != null) {
			add(copyHead.value());
			copyHead = copyHead.next();
		}
	}
 
	public void add(int index, E e) {
		DoubleLinkedListNode<E> current = head;
		DoubleLinkedListNode<E> newNode = new  DoubleLinkedListNode<E>(e);
		int count = 0;

		while (current != null) {
			if (count == index) {
				break;
			}
			current = current.next();
			count++;
		}
		

		DoubleLinkedListNode<E> prev = current.prev();
		
		prev.next(newNode);
		newNode.prev(prev);
		newNode.next(current);
		current.prev(newNode);
		size++;
	}
	public boolean add(E e) {
		DoubleLinkedListNode<E> node = new  DoubleLinkedListNode<E>(e);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next(node);
			node.prev(tail);
			tail = tail.next();
		}
		size++;
		return true;
	}
	int size() {
		return this.size;
	}
	boolean contains(E e) {
		DoubleLinkedListNode<E> node = head;
		while (node!= null) {
			if (node.value().equals(e)) {
				return true;
			}
			node = node.next();
		}
		return false;
	}
	DoubleLinkedListNode<E>  get(int index) {
		DoubleLinkedListNode<E> node = head;
		int count = 0;
		while (node!= null) {
			if (index == count) {
				return node;
			}
			node = node.next();
			count++;
		}
		return node;
		
	}
	int indexOf(E e) {
		DoubleLinkedListNode<E> node = head;
		int count = 0;
		while (node!= null) {
			if (node == e) {
				break;
			}
			node = node.next();
			count++;
		}
		return count;
		
	}
	int lastIndexOf(E e) {
		DoubleLinkedListNode<E> node = head;
		int index = 0;
		int count = 0;
		while (node!= null) {
			if (node.value() == e) {
				count = index;
			}
			node = node.next();
			index++;
		}
		return count;
	}
	boolean remove(E e) {
		DoubleLinkedListNode<E> node = head;
		
		while (head != null) {
			if (node == e) {
				break;
			}
		}
		
		DoubleLinkedListNode<E> prev = node.prev();
		DoubleLinkedListNode<E> next = node.next();
		
		if (prev != null) {
		prev.next(next);
		} 
		if (next != null) {
		next.prev(prev);
		}
		node.prev(null);
		node.next(null);
		
		size--;
		return true;
	}
	E removeElementAtIndex(int index) {
		DoubleLinkedListNode<E> node = head;
		int count = 0;
		while (head != null) {
			if (index == count) {
				break;
			}
			count++;
		}
		remove(node.value());
		
		return node.value();
	}
	void clear() {
		head = null;
		tail = null;
	} 
	E set(int index, E e) {
		DoubleLinkedListNode<E> current = head;
		int count = 0;

		while (current != null) {
			if (count == index) {
				break;
			}
			current = current.next();
			count++;
		}
		current.value(e); 
		return current.value();
	}
	public boolean addAll(MyDoubleLinkedList<E> c) {
		DoubleLinkedListNode<E> newHead = c.head;
		tail.next(newHead);
		newHead.prev(tail);
		return true;
	}
	public boolean addAll(int index, MyDoubleLinkedList<E> c) {
		int count = 0; 
		DoubleLinkedListNode<E> current = head;
		while (current != null) {
			if (count == index) {
				break;
			}
			current = current.next();
			count++;
		}
		DoubleLinkedListNode<E> prev = current.prev();
		if (prev != null) {
		prev.next(c.head);
		c.head.prev(prev);
		current.prev(c.tail);
		c.tail.next(current);
		} else {
			head = c.head;
		}
		return true;
	} 
	
	public void print() {
		DoubleLinkedListNode<E> current = head;
		while (current != null) {
			System.out.print(current.value() + " ");
			current = current.next();
		}
	}
	
	public E[] toArray() {
		E[] elements = (E[]) new Object[this.size];
		DoubleLinkedListNode<E> current = head;
		int index = 0;
		while (current != null) {
			elements[index++] = current.value();
		}
		return elements;
	}
}
