/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.linked_list;

/**
 *
 * @author vaibhav
 */
public class LLDeletion {

    public static void main(String[] args) {
        LinkedList_3 ll = new LinkedList_3();

        LinkedList_3.Node head = new LinkedList_3.Node(2);
        ll.head = head;

        LinkedList_3.Node second = new LinkedList_3.Node(34);
        ll.head.next = second;
        LinkedList_3.Node third = new LinkedList_3.Node(12);
        second.next = third;

        LinkedList_3.Node forth = new LinkedList_3.Node(42);
        third.next = forth;
        ll.print();

//        ll.delete(third);
//        ll.print();
//        
//        ll.delete(head);
//        ll.print();
        ll.delete(34);
        ll.print();

        ll.delete(42);
        ll.print();

        ll.delete(2);
        ll.print();
    }
}

class LinkedList_3 {

    Node head;

    public void delete(int val) {
        Node toDel = head;
        Node prev = null;

        if (toDel != null && toDel.data == val) {
            head = toDel.next;
            return;
        }

        while (toDel != null && toDel.data != val) {
            prev = toDel;
            toDel = toDel.next;
        }
        if (toDel == null) {
            return;
        }
        prev.next = toDel.next;
    }

    public Node delete(Node toDel) {
        if (toDel == null) {
            System.out.println("The given previous node cannot be null");
            return null;
        }
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        if (head.equals(toDel)) {
            head = head.next;
            return head;
        }
        Node prevNode = head;
        while (!prevNode.next.equals(toDel)) {
            prevNode = prevNode.next;
        }
        prevNode.next = toDel.next;
        return prevNode.next;
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

        @Override
        public boolean equals(Object obj) {
            Node n = (Node) obj;
            return data == n.data;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 19 * hash + this.data;
            return hash;
        }

    }
}
