/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.linked_list;

/**
 *
 * @author vaibhav
 */
public class LLTraversal {

    public static void main(String[] args) {
        LinkedList_1.Node head = new LinkedList_1.Node(2);

        LinkedList_1 ll = new LinkedList_1(head);

        LinkedList_1.Node second = new LinkedList_1.Node(34);
        head.next = second;

        LinkedList_1.Node third = new LinkedList_1.Node(12);
        second.next = third;

        ll.printll();
//        printll(ll.head);

    }

    public static void printll(LinkedList_1.Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        printll(node.next);        
    }
}

class LinkedList_1 {

    Node head;

    public LinkedList_1(Node head) {
        this.head = head;
    }

    public void printll() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data+" ");
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
