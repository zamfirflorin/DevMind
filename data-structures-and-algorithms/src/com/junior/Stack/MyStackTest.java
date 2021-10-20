package com.junior.Stack;

public class MyStackTest {

    public static void main(String[] args) {
        MyStack<Integer> stack  =  new MyStack<>();

        System.out.println("peek : " + stack.peek());
        System.out.println("pop : " + stack.pop());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("peek : " + stack.peek());
        stack.pop();
        stack.push(5);
        System.out.println("isEmpty : " + stack.isEmpty());
        stack.pop();
        stack.push(21);
        System.out.println("pop : " + stack.pop());
        System.out.println("peek : " + stack.peek());

        System.out.println("isEmpty : " + stack.isEmpty());
        System.out.println("pop : " + stack.pop());
        System.out.println("printing elements below");
        
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        while (!stack.isEmpty()) {
        	System.out.print(stack.pop() + " ");
        }
        
    }

}
