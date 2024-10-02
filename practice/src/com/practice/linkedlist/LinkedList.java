package com.practice.linkedlist;

public class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    Node insertLast(int data) {
        head = insertDataLast(head, data);
        return head;
    }

    Node insertFirst(int data) {
        Node first = new Node(data);
        first.next = head;
        head = first;
        return head;
    }

    private Node insertDataLast(Node head, int data) {
        if (head == null) {
            head = new Node(data);
            return head;
        }
        head.next = insertDataLast(head.next, data);
        return head;
    }

    void printList() {
        printListData(head);
    }

    private void printListData(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.data);
        printListData(head.next);
    }

}
