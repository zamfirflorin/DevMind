package com.junior.Stack;

public class RingBuffer {

    private int capacity;
    private int size;
    private int writeIndex;
    private int head;
    private int[] array;

    public RingBuffer(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.writeIndex = -1;
        this.head = 0;
        this.array = new int[capacity];
    }

    public boolean enQueue(int elem) {
        writeIndex = (writeIndex + 1) % capacity;
        array[writeIndex] = elem;

        if (size < capacity) {
        	size++;
        }
        else if (size == capacity) {
        	head++;
        }

        return true;
    }

    public int deQueue() {
        if (isEmpty()) return -1;

        int read = head % capacity;
        head++;
        size--;

        return array[read];
    }

    public int peek() {
        if (isEmpty()) return -1;

        int read = head % capacity;
        return array[read];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    public void print() {
        System.out.println("Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[(head + i) % capacity] + " ");
        }
        System.out.println();
    }

}
