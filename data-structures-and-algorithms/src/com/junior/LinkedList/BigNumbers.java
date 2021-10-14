package com.junior.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class BigNumbers {

	
	//O (max(n, m) time | O (max(n, m) space;
	public LinkedList<Integer> sum(LinkedList<Integer> op1, LinkedList<Integer> op2) {
		  ListIterator<Integer> aIter =  op1.listIterator(op1.size());
		  ListIterator<Integer> bIter =  op2.listIterator(op2.size());
		  LinkedList<Integer> result = new LinkedList<Integer>();
		  int cat = 0;
		  int first;
		  int second;
		  while (aIter.hasPrevious() && bIter.hasPrevious()) {
			  first = aIter.previous();
			  second = bIter.previous();
			  
			  int lastDigit = (first + second + cat ) % 10;
			  cat = (first + second + cat) / 10;
			  result.addFirst(lastDigit);
		  }
		  
		  if (cat != 0) {
			  if (aIter.hasPrevious()) {
				  int element = aIter.previous();
				  if (element != 9) {
					  result.addFirst(element + cat);
				  } else {
					  result.addFirst(0);
					  if (aIter.hasPrevious()) {
						  result.addFirst(aIter.previous() + 1);
					  }
					  else {
						  result.addFirst(1);
					  }
				  } 
			  } else {
				  while (bIter.hasPrevious()) {
					  int element = bIter.previous();
					  if (element == 9) {
						  result.addFirst((element + cat) % 10);
						  cat = (element + cat) / 10;
	
						  if (!bIter.hasPrevious()) {
							  result.addFirst(1);
							  cat = 0;
						  }
					  } else {
						  result.addFirst(element + cat);
						  cat = (element + cat) / 10;
					  }
			  }
		  }
		  }
		  return result;
	}

	public static void main(String[] args) {
		System.out.println("Checking input...");

		LinkedList<Integer> op1 = new LinkedList<>();
		op1.add(3);
		op1.add(1);
		op1.add(7);
		op1.add(0);
		LinkedList<Integer> op2 =new LinkedList<>();
		op2.add(9);
		op2.add(9);
		op2.add(9);
		op2.add(5);
		op2.add(9);
		op2.add(6);
		BigNumbers bn = new BigNumbers();
		System.out.println(noToString(op1));
		System.out.println(noToString(op2));
		LinkedList<Integer> rez = bn.sum(op1, op2);
		System.out.println(noToString(op1));
		LinkedList<Integer> correct = new LinkedList<>();
		correct.add(2);
		correct.add(7);
		correct.add(7);
		correct.add(4);
		System.out.println(
				noToString(op1) + " + " + noToString(op2) + " = " 
							+ noToString(rez) + " C: " + noToString(correct));
	}

	private static String noToString(LinkedList<Integer> op1) {
		StringBuilder sb = new StringBuilder();
		ListIterator<Integer> it = op1.listIterator();
		while(it.hasNext()) {
			
			sb.append(it.next());
		}
		return sb.toString();
	}
	
	
	
}
