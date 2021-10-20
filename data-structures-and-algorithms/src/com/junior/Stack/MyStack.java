package com.junior.Stack;


import com.junior.LinkedList.MyDoubleLinkedList;

public class MyStack<E> {

	MyDoubleLinkedList<E> stack;
    
	public MyStack() {
        stack = new MyDoubleLinkedList<>();
    }


    @SuppressWarnings("unchecked")
	public E peek() {
        if (isEmpty()) return null;
        int size = stack.size();
        return (E) stack.get(size - 1);
    }


    public void push(E val) {
        stack.add(val);
    }


    public E pop() {
        if (isEmpty()) return null;
        int size = stack.size();
        return stack.removeElementAtIndex(size - 1);
    }


    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
