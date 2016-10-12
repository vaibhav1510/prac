/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.linked_list;

import static Practice.linked_list.LinkedList_4.*;

/**
 *
 * @author vaibhav
 */
public class RevLinkedList {

    public static void main(String[] args) {

        LinkedList_4 ll = new LinkedList_4();
        ll.head = new Node(4);
        ll.head.next = new Node(12);
        ll.head.next.next = new Node(7);
        ll.head.next.next.next = new Node(10);
        ll.add(70);
        ll.print();

        ll.reverse();
        ll.print();

        LinkedList_4 rev = new LinkedList_4();
        reveseLinkedList(ll.head, rev);
        rev.print();
    }

    private static LinkedList_4.Node reveseLinkedList(LinkedList_4.Node node, LinkedList_4 rev) {
        if (node == null) {
            return node;
        }
        Node n = reveseLinkedList(node.next, rev);
        rev.add(node.data);
        return n;
    }
}

class LinkedList_4 {

    Node head;

    public void print() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public void add(Integer data) {
        Node newNode = new Node(data);
        Node last = head;
        if (last == null) {
            head = newNode;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    static class Node {

        Integer data;
        Node next;

        public Node(int data) {

            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return data.toString();
        }

    }
}
