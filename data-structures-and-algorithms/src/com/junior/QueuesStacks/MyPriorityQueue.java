package com.junior.QueuesStacks;

import java.util.LinkedList;
import java.util.ListIterator;

public class MyPriorityQueue<Integer> {

	int val;
	LinkedList<Double> queue = new LinkedList<>();
	
	public MyPriorityQueue() {
		this.val = val;
	}
	
	public boolean add(Double e) {
		ListIterator<Double> it = queue.listIterator(queue.size());

		if (queue.isEmpty()) {
			return queue.add(e);
		}
		else {
			while (it.hasPrevious()) {
				double element = it.previous();
				while (it.hasPrevious()) {
				if ((double) e < element) {
					it.add(e);
					return true;
				}
				if (!it.hasPrevious()) {
					it.add(e);
					return true;
				}
			}
		}
		}
		return true;
	}
	
	public void remove() {
		queue.removeFirst();
	}
	public Double get() {
		return queue.getFirst();
	}
	
	public void print() {
		queue.forEach(x -> System.out.print(x + " "));
	}
	
}