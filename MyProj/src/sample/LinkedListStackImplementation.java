/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.util.LinkedList;

/**
 *
 * @author vaibhav
 */
public class LinkedListStackImplementation<E> {

    private LinkedList<E> list;

    public LinkedListStackImplementation() {
        this.list = new LinkedList<E>();
    }

    public boolean add(E e) {
        return list.add(e);
    }

    public E remove() {
        return list.removeLast();
    }

    public E peek() {
        return list.peekLast();
    }

    public boolean contains(E e) {
        return list.contains(e);
    }

}
