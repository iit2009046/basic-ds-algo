package com.practice.linkedlist;

public class Main {

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.insertLast(50);
        list.insertLast(60);
        list.insertLast(70);
        list.insertLast(80);
        list.insertLast(90);
        list.insertLast(100);
        list.insertLast(150);

        list.insertFirst(140);
        list.printList();
    }
}
