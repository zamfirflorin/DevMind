package com.junior.LinkedList;

public class TestDoubleLinkedList {

    public static void main(String[] args) {
        MyDoubleLinkedList<Integer> list = new MyDoubleLinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(5);
        
        list.print();
        //1 -> 2 -> 3 -> 3 -> 4 -> 5
 

        System.out.println("\nsize " + list.size());

        System.out.println("contains 3: " + list.contains(3));
        System.out.println("index of 2: " + list.indexOf(2));
        System.out.println("index of 9: " + list.indexOf(9));

        System.out.println("last idx of 3: " + list.lastIndexOf(3));
        
        System.out.println("Remove element at index 0 - element is " + list.removeElementAtIndex(0));
        list.print();
        System.out.println(list.get(0));
        System.out.println("Remove element at index 5 - element is " + list.removeElementAtIndex(5));
        list.print();
        System.out.println("Remove element 4  " + list.remove(4));
        list.print();
    }
}