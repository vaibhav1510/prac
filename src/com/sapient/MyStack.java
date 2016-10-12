package com.sapient;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyStack<E> {

	private int maximumCapacity = 10;
	private int top = -1;
	private E[] arr;

	@SuppressWarnings("unchecked")
	public MyStack() {
		this.arr = (E[]) new Object[maximumCapacity];
	}

	@SuppressWarnings("unchecked")
	public MyStack(int initialCapacity) {
		this.maximumCapacity = initialCapacity;
		this.arr = (E[]) new Object[maximumCapacity];
	}

	public MyStack<E> add(E e) {
		checkCapacity();
		arr[++top] = e;
		return this;
	}

	public E remove() {
		if (top == -1) {
			throw new NoSuchElementException();
		}
		E e = arr[top];
		arr[top--] = null;
		return e;
	}

	public E peek() {
		if (top == -1) {
			throw new NoSuchElementException();
		}
		return arr[top];
	}

	public boolean contains(E e) {
		if (top == -1) {
			return false;
		}
		for (int i = top; i > -1; i--) {
			if (arr[i].equals(e)) {
				return true;
			}
		}
		return false;
	}

	private void checkCapacity() {
		if (top + 1 < maximumCapacity) {
			return;
		}
		maximumCapacity += maximumCapacity / 2;
		System.out.println(maximumCapacity);
		arr = Arrays.copyOf(arr, maximumCapacity);
	}

	public int size() {
		return top + 1;
	}
}
