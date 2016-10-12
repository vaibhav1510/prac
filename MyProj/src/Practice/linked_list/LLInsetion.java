/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.linked_list;

/**
 *
 * @author vaibhav
 */
public class LLInsetion {

    public static void main(String[] args) {
        LinkedList_2 ll = new LinkedList_2();

        ll.addAtFirst(1);
        ll.print();

        ll.addAtLast(4);
        ll.print();

        LinkedList_2.Node head = new LinkedList_2.Node(2);
        ll.head = head;

        LinkedList_2.Node second = new LinkedList_2.Node(34);
        ll.head.next = second;
        LinkedList_2.Node third = new LinkedList_2.Node(12);
        second.next = third;
        ll.print();

        ll.addAtFirst(67);
        ll.print();

        ll.addAtLast(23);
        ll.print();

        ll.addAfter(second, 78);
        ll.print();
    }
}

class LinkedList_2 {

    Node head;

    public LinkedList_2() {

    }

    public void addAtFirst(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
    }

    public void addAtLast(int val) {
        Node n = new Node(val);
        if (head == null) {
            head = n;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = n;
    }

    public boolean addAfter(Node prevNode, int val) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null");
            return false;
        }
        Node n = new Node(val);
        if (head == null) {
            return false;
        }
        n.next = prevNode.next;
        prevNode.next = n;
        return true;
    }

    public void print() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
}
