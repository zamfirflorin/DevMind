package com.junior.LinkedList;

public class MyDoubleLinkedList<E> {
	
	private DoubleLinkedListNode<E> head = null;
	private DoubleLinkedListNode<E> tail = null;
	private int size = 0;
 
	private int getSize() {
		return size;
	}
 
	public MyDoubleLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
 
	public MyDoubleLinkedList(MyDoubleLinkedList<E> list) {
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
	
	public boolean contains(E e) {
		DoubleLinkedListNode<E> node = head;
		while (node!= null) {
			if (node.value().equals(e)) {
				return true;
			}
			node = node.next();
		}
		return false;
	}
	
	public DoubleLinkedListNode<E>  get(int index) {
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
	
	public int indexOf(E e) {
		DoubleLinkedListNode<E> node = head;
		int count = 0;
		while (node != null) {
			if (node.value().equals(e)) {
				return count;
			}
			node = node.next();
			count++;
		}

		return -1;
		
	}
	//1 -> 2 -> 3 -> 3 -> 4
	public int lastIndexOf(E e) {
		DoubleLinkedListNode<E> node = head;
		int index = 0;
		int count = -1;
		while (node != null) {
			if (node.value().equals(e)) {
				count = index;
			}
			node = node.next();
			index++;
		}
		return count;
	}
	
	public boolean remove(E e) {
		DoubleLinkedListNode<E> node = head;

		while (node != null) {
			if (node.value().equals(e)) {
				break;
			}
			node = node.next();
		}
		if (node == null) {
			return false;
		}

		// if node head
		if (node.prev() == null) {
			// if node is not also tail
			if (node.next() != null) {
				head = node.next();
				node.next(null);
				head.prev(null);
				size--;
				return true;
			} else {
				head = null;
				tail = null;
				size--;
				return true;
			}
		}
		if (node.next() == null) {
			tail = node.prev();
			tail.next(null);
			node.prev(null);
			size--;
			return true;
		}

		DoubleLinkedListNode<E> prev = node.prev();
		DoubleLinkedListNode<E> next = node.next();

		prev.next(next);
		next.prev(prev);
		node.next(null);
		node.prev(null);
		size--;
		return true;
	}
	
	public E removeElementAtIndex(int index) {
		DoubleLinkedListNode<E> node = head;
		int count = 0;
		while (node != null) {
			if (index == count) {
				break;
			}
			node = node.next();
			count++;
		}
		E result = node.value();
		
		//if node head
		if (node.prev() == null) {
			//if node is not also tail
			if (node.next() != null) {
				head = node.next();
				node.next(null);
				head.prev(null);
				size--;
				return result;
			} else {
				head = null;
				tail = null;
				size--;
				return result;
			}
		} 
		if (node.next() == null) {
			tail = node.prev();
			tail.next(null);
			node.prev(null);
			size--;
			return result;
		}
		
		DoubleLinkedListNode<E> prev  = node.prev();
		DoubleLinkedListNode<E> next  = node.next();
		
		prev.next(next);
		next.prev(prev);
		node.next(null);
		node.prev(null);
		size--;
		return result;
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
		System.out.println();
	}
	
	public E[] toArray() {
		E[] elements = (E[]) new Object[this.size];
		DoubleLinkedListNode<E> current = head;
		int index = 0;
		while (current != null) {
			elements[index++] = current.value();
			current = current.next();
		}
		return elements;
	}
}
