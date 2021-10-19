package com.junior.QueuesStacks;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class PostFixEvaluator {
	
	LinkedList<Character> stack = new LinkedList<>();
	
	
	public int evaluate(ArrayDeque<Character> queue) {
	
		while (!queue.isEmpty()) {
			char ch = queue.peek();
			if (isNumeric(ch)) {
				stack.addFirst(ch);
			}
			if (isOperator(ch)) {
				int op1 = stack.pop();
				int op2 = stack.pop();
				stack.addFirst((char) makeCalculus(op1, op2, ch));
			}
		}
		

	}
	
	private static boolean isOperator(char ch) {
		Character[] operators = { '+', '-', '*', '/','^'};
		for (char op : operators) {
			if (ch == op) {
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

	private static int makeCalculus(int a, int b, char ch) {
		return switch(ch) { 
			case '+' -> a + b;
			case '-' -> a - b;
			case '*' -> a * b;
			case '/' -> a / b;
			case '^' -> (int) Math.pow(a, b);
		default -> throw new IllegalArgumentException("Unexpected value: " + ch);
		};
	}

}
