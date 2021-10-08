package com.junior.LinkedList;

public class TestDoubleLinkedList {

    public static void main(String[] args) {
        MyDoubleLinkedList<Integer> doubleLinkedList = new MyDoubleLinkedList<>();

        doubleLinkedList.add(1);
        doubleLinkedList.add(2);
        doubleLinkedList.add(3);
        doubleLinkedList.add(3);
        doubleLinkedList.add(4);
        doubleLinkedList.add(5);
        
        doubleLinkedList.print();

        System.out.println(doubleLinkedList.toString());

        System.out.println("size " + doubleLinkedList.size());

        System.out.println("contains 3: " + doubleLinkedList.contains(3));

        System.out.println("last idx of 3: " + doubleLinkedList.lastIndexOf(3));


    }
}