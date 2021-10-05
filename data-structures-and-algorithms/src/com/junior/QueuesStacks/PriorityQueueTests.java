package com.junior.QueuesStacks;

public class PriorityQueueTests {

	public static void main(String[] args) {
		MyPriorityQueue<Double> queue = new MyPriorityQueue();
		
		queue.add(-0.66);
		queue.print();
		queue.add(-1.0);
		System.out.println();
		queue.print();
		queue.add(3.14);
		System.out.println();
		queue.print();
		queue.add(1.0);
		System.out.println();
		queue.print();
		
	}

}
