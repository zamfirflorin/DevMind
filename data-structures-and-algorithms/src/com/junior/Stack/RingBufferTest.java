package com.junior.Stack;

public class RingBufferTest {
    public static void main(String[] args) {
    	RingBuffer ring = new RingBuffer(8);

        ring.enQueue(1);
        ring.enQueue(2);
        ring.enQueue(3);
        ring.enQueue(4);
        ring.enQueue(5);
        ring.enQueue(6);
        ring.enQueue(7);
        ring.enQueue(8);

        ring.print();
        System.out.println("Dequeiuing");
        ring.deQueue();
        System.out.println("after dequeue");
        ring.print();

        ring.enQueue(9);
        System.out.println("added 9");
        ring.print();
        System.out.println("Dequeiuing");
        ring.deQueue();
        System.out.println("after dequeue");
        ring.print();
        
        
        ring.enQueue(10);
        System.out.println("added 10");
        ring.print();
        System.out.println("Dequeiuing");
        ring.deQueue();
        System.out.println("after dequeue");
        ring.print();
        

    }
}
