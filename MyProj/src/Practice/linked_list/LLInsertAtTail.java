/*
 * Copyright (c) 2017 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.linked_list;

/**
 *
 * @author Vaibhav <vaibhav@chargebee.com>
 */
public class LLInsertAtTail {

    static class Node {

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        int data;
        Node next;
    }

    Node Insert(Node head, int data) {
        if (head == null) {
            return new Node(data, null);
        }
        head.next = Insert(head.next, data);
        return head;
    }

    void print(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.data);
        print(head.next);
    }

    public static void main(String[] args) {

        Node h = null;
//        new Node(2, null);
//        h.next = new Node(3, null);
//        h.next.next = new Node(4, null);

        LLInsertAtTail ll = new LLInsertAtTail();
        ll.print(ll.Insert(h, 5));

    }
}
