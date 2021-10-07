package com.junior.QueuesStacks;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class Dijkstra {
	
	
	public static void main(String[] args) {
		String str = "3+(2+1)*2^3^2-8/(5-1*2/2)";
		evalRPN(str);
		
		//queue = 3 
		//stack
	}

	public static ArrayDeque<Character> evalRPN(String tokens) {
		ArrayDeque<Character> queue = new ArrayDeque<>();
		LinkedList<Character> stack = new LinkedList<>();

		for (Character str : tokens.toCharArray()){
			if (isNumeric(str)) {
				queue.add(str);
			} else if (isOperator(str)) {
				while (isOperator(stack.peek()) && stack.peek() != '(' && (precedenta(str) < precedenta(stack.peek())
						|| precedenta(str) == precedenta(stack.peek()) && precedenta(stack.peek()) != 13)) {
					queue.add(stack.pop());
				}
				stack.add(str);
			}
			// 1.4
			else if (str == '(') {
				stack.add(str);
			}
			// 1.5
			else if (str == ')') {
				Character O = stack.peek();
				// 1.5.1
				while (O != '(') {
					queue.add(stack.pop());
				}
				// 1.5.2
				if (stack.isEmpty()) {
					System.out.println("expresia avea paranteze gresite");
					return queue;
				}
				// 1.5.3
				stack.pop();
			}
		}
		while (!stack.isEmpty()) {
			if (stack.peek() == '(') {
				System.out.println("expresia avea paranteze gresite");
				return queue;
			}
			queue.add(stack.pop());
		}
		for (Character str : queue) {
			System.out.print(str + "");
		}
		return queue;
	}

	private static boolean isOperator(Character str) {
		Character[] operators = { '+', '-', '*', '/' };
		for (Character op : operators) {
			if (str == op) {
				return true;
			}
		}
		return false;
	}

	private static boolean isNumeric(Character str) {
	
			if (!Character.isDigit(str))
				return false;
		
		return true;
	}

	private static int precedenta(Character str) {

		if (str == '+' || str == '-') {
			return 11;
		} else if (str == '*' || str == '/') {
			return 12;
		} else if (str == '^') {
			return 13;
		}
		return -1;

	}

}
