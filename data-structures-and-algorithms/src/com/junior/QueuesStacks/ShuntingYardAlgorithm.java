package com.junior.QueuesStacks;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class ShuntingYardAlgorithm {
	
	public static void main(String[] args) {
		String str = "3+(2+1)*2^3^2-8/(5-1*2/2)";
		ArrayDeque<Character> postfixed = evalRPN(str);
		int result = evaluate(postfixed);
		System.out.println();
		System.out.println(result);
	}
	
	
	public static int evaluate(ArrayDeque<Character> queue) {
		LinkedList<Integer> numberStack = new LinkedList<>();
		int aux;
		int op1;
		int op2;
		while (!queue.isEmpty()) {
			Character ch = queue.removeFirst();
			if (isNumeric(ch)) {
				numberStack.addFirst(Character.getNumericValue(ch));
				continue;
			}
			if (isOperator(ch)) {
				if (numberStack.isEmpty()) {
					System.out.println("expresia postfixata este gresita");
					return -1;
				} else {
					op1 = numberStack.pop();
				}
				if (numberStack.isEmpty()) {
					System.out.println("expresia postfixata este gresita");
					return -1;
				} else {
					op2 = numberStack.pop();
				}
				
				aux = makeCalculus(op1, op2, ch);
				numberStack.addFirst(aux);
			}
		}
		int result = numberStack.pop();

		
        if (!numberStack.isEmpty()) {
            System.out.println("expresia postfixata este gresita");
            return -1;
        }

        return result;
		
	}
	

	public static ArrayDeque<Character> evalRPN(String tokens) {
		ArrayDeque<Character> queuePostfixed = new ArrayDeque<>();
		LinkedList<Character> stack = new LinkedList<>();

		for (char ch : tokens.toCharArray()){
			if (isNumeric(ch)) {
				queuePostfixed.add(ch);
			
			}
			if (isOperator(ch)) {

				while (!stack.isEmpty() && isOperator(stack.peek()) && stack.peek() != '(' && (precedenta(ch) < precedenta(stack.peek())
						|| precedenta(ch) == precedenta(stack.peek()) && isLeftPrecedence(stack.peek()))) {
					//1.3.1.1
					queuePostfixed.add(stack.pop());
				}
				//1.3.2
				stack.addFirst(ch);
			}
			// 1.4
			if (ch == '(') {
				stack.addFirst(ch);
			}
			// 1.5
			if (ch == ')') {
				// 1.5.1
				while (stack.peek() != '(') {
					queuePostfixed.add(stack.pop());
				}
				// 1.5.2
				if (stack.isEmpty()) {
					System.out.println("expresia avea paranteze gresite");
					return queuePostfixed;
				}
				// 1.5.3
				stack.pop();
			}
		}
		while (!stack.isEmpty()) {
			if (stack.peek() == '(') {
				System.out.println("expresia avea paranteze gresite");
				return queuePostfixed;
			}
			queuePostfixed.add(stack.pop());
		}
		for (char ch : queuePostfixed) {
			System.out.print(ch + "");
		}
		return queuePostfixed;
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
	
	
	private static boolean isLeftPrecedence(char ch) {
		return switch (ch) {
		case '+', '-','*', '/' -> true;
		default -> false;
		};
	}
	
	private static int precedenta(char ch) {
		return switch (ch) {
			case '+', '-' -> 11;
			case '*', '/' -> 12;
			case '^' -> 13;
			default -> -1;
		
		};
	}
	
	private static int makeCalculus(int a, int b, char ch) {

		return switch(ch) { 
			case '+' -> a + b;
			case '-' -> b - a;
			case '*' -> a * b;
			case '/' -> b / a;
			case '^' -> (int) Math.pow(b, a);
		default -> -1;
		};
	}
	
}
