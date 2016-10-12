/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.stack;

import java.util.LinkedList;

/**
 *
 * @author vaibhav
 */
public class StackUsingLinkedList<E> {

    LinkedList<E> stack;

    public StackUsingLinkedList() {
        stack = new LinkedList<E>();
    }

    public void push(E e){
        stack.add(stack.size(), e);
    }
    
    public E pop() {
        return stack.removeLast();
    }

    public E peek() {
        if(isEmpty()){
            return null;
        }
        return stack.get(size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
    
    public static void main(String[] args) {
        
        StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        
        
        System.out.println(stack.pop());
        System.out.println(stack.peek());               
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
    }

}
