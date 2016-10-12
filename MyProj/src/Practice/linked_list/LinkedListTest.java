/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.linked_list;

import java.util.LinkedList;

/**
 *
 * @author vaibhav
 */
public class LinkedListTest {

    public static void main(String args[]) {

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("A");// A
        linkedList.add("B");// A,B
        linkedList.addLast("C"); // A,B,C
        linkedList.addFirst("D"); // D,A,B,C
        linkedList.add(2, "E"); // D,A,E,B,C
        linkedList.add("F"); // D,A,E,B,C,F
        linkedList.add("G"); // D,A,E,B,C,F,G
        System.out.println("Linked list : " + linkedList);

        // Removing elements from the linked list
        linkedList.remove("B");// D,A,E,C,F,G
        linkedList.remove(3); // D,A,E,F,G
        linkedList.removeFirst(); // A,E,F,G
        linkedList.removeLast(); // A,E,F
        System.out.println("Linked list after deletion: " + linkedList);

        // Finding elements in the linked list
        boolean status = linkedList.contains("E");

        if (status) {
            System.out.println("List contains the element 'E' ");
        } else {
            System.out.println("List doesn't contain the element 'E'");
        }

        // Number of elements in the linked list
        int size = linkedList.size();
        System.out.println("Size of linked list = " + size);

        // Get and set elements from linked list
        Object element = linkedList.get(2);
        System.out.println("Element returned by get() : " + element);
        linkedList.set(2, "Y"); // A,E,Y
        System.out.println("Linked list after change : " + linkedList);

        linkedList.add("X"); // A,E,Y,X
        linkedList.add("Z"); // A,E,Y,X,Z

        System.out.println("Linked list after change : " + linkedList);

        System.out.println("Linked list poll first: " + linkedList.pollFirst()); // E,Y,X,Z      
        System.out.println("Linked list poll last: " + linkedList.pollLast()); // E,Y,X
        System.out.println("Linked list poll: " + linkedList.poll()); // Y,X

        System.out.println("Linked list peek: " + linkedList.peek()); // Y,X
        System.out.println("Linked list after change : " + linkedList); // Y,X
    }
}
