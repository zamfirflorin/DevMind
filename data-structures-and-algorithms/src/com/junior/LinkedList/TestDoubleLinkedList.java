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
 

        System.out.println("\nList size " + list.size());

        System.out.println("contains 3: " + list.contains(3));
        System.out.println("index of 2: " + list.indexOf(2));
        System.out.println("Checking the index of a non existining element e.g. index of 9: " + list.indexOf(9));

        System.out.println("last idx of 3: " + list.lastIndexOf(3));
        
        System.out.println("Remove element at index 0 - element is " + list.removeElementAtIndex(0));
        list.print();
        System.out.println(list.get(0));
        System.out.println("Remove element at index 5 - element is " + list.removeElementAtIndex(5));
        list.print();
        System.out.println("Remove element 4  " + list.remove(4));
        list.print();
        System.out.println("Remove element 3  " + list.remove(3));
        list.print();
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("Added new elements");
        list.print();
        list.add(5, 10);
        list.print();
        MyDoubleLinkedList<Integer> anotherList = new MyDoubleLinkedList<>();
        anotherList.add(22);
        anotherList.add(33);
        System.out.println("Adding elements of another list at the begginning ");
        System.out.println("\nList size " + list.size());
        anotherList.print();
        list.addAll(0, anotherList);
        list.print();
        System.out.println("\nList size " + list.size());
        System.out.println("Printing another list");
        anotherList.print();
        
        System.out.println("Adding elements of another list starting with index 1 ");
        list.addAll(1, anotherList);
        list.print();
        System.out.println("\nList size " + list.size());
        System.out.println("Printing another list");
        anotherList.print();
        
        
        System.out.println("Adding elements of another list at the end");
        System.out.println("\nList size " + list.size());
        list.addAll(anotherList);
        list.print();
        System.out.println("\nList size " + list.size());
        System.out.println("Printing another list");
        anotherList.print();
        System.out.println("\nList size " + list.size());
        System.out.println("Adding elements of another list at the end==========");
        list.addAll(12, anotherList);
        list.print();
        System.out.println("\nList size " + list.size());
        System.out.println("Printing another list");
        anotherList.print();
        
        
    }
}