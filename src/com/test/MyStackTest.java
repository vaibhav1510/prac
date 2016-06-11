package com.test;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

import com.sapient.MyStack;

public class MyStackTest {

	@Test
	public void addRemoveNull() {
		MyStack<Integer> stack = new MyStack<>();
		stack.add(null); // 1
		assertEquals(stack.peek(), null);
		assertEquals(stack.size(), 1);
		assertEquals(stack.remove(), null); // 0
		assertEquals(stack.size(), 0);
		stack.add(null); // 1
		stack.add(null); // 2
		assertEquals(stack.size(), 2);
	}

	@Test
	public void addDuplicate() {
		MyStack<Integer> stack = new MyStack<>();
		stack.add(10); // 1
		stack.add(10); // 2
		assertEquals(stack.size(), 2);
		assertEquals(stack.remove(), Integer.valueOf(10));
		assertEquals(stack.peek(), Integer.valueOf(10));
	}

	@Test
	public void addRemove() {
		MyStack<Integer> stack = new MyStack<>();
		stack.add(10); // 1
		stack.add(20); // 2
		assertEquals(stack.size(), 2);
		assertEquals(stack.remove(), Integer.valueOf(20));
		assertEquals(stack.size(), 1);
	}

	@Test
	public void peek() {
		MyStack<Integer> stack = new MyStack<>();
		stack.add(10); // 1
		stack.add(20); // 2
		assertEquals(stack.size(), 2);
		assertEquals(stack.peek(), Integer.valueOf(20));
		assertEquals(stack.size(), 2);
	}

	@Test(expected = NoSuchElementException.class)
	public void noSuchElementRemoveOper() {
		MyStack<Integer> stack = new MyStack<>();
		stack.remove();
	}

	@Test(expected = NoSuchElementException.class)
	public void noSuchElementPeekOper() {
		MyStack<Integer> stack = new MyStack<>();
		stack.peek();
	}

	@Test
	public void containsWhenEmpty() {
		MyStack<Integer> stack = new MyStack<>();
		assertFalse(stack.contains(Integer.valueOf(10)));
	}

	@Test
	public void search() {
		MyStack<Integer> stack = new MyStack<>();
		stack.add(Integer.valueOf(10));
		stack.add(Integer.valueOf(20));
		stack.add(Integer.valueOf(30));
		stack.add(Integer.valueOf(40));
		assertTrue(stack.contains(Integer.valueOf(30)));
		assertFalse(stack.contains(Integer.valueOf(340)));
	}

	@Test
	public void expandInitialCapacity() {
		MyStack<Integer> stack = new MyStack<>();
		for (int i = 0; i < 100; i++) {
			stack.add(Integer.valueOf(i));
		}
		assertEquals(stack.size(), 100);
	}

	// @Test
	// public void enforsedTypeSafety() {
	// MyStack<Integer> stack = new MyStack<>();
	// stack.add("string");
	// }

}
