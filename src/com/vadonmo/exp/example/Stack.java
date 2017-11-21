package com.vadonmo.exp.example;

import java.util.Iterator;

import com.vadonmo.exp.api.StdIn;
import com.vadonmo.exp.api.StdOut;

/**
 * 下压堆栈，链表实现
 * 
 * @author vadon
 *
 */
public class Stack<Item> implements Iterable<Item> {

	// 栈顶
	private Node first;
	// 元素数量
	private int N;

	// 节点定义
	private class Node {
		Item item;
		Node next;
	}

	public boolean isEmpty() {
		return first == null;// or N == 0
	}

	public int size() {
		return N;
	}

	public void push(Item item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}

	public Item pop() {
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}

	public Item peek() {
		Item item = first.item;
		return item;
	}

	@Override
	public Iterator<Item> iterator() {
		return new ListIterator();
	}

	private class ListIterator implements Iterator<Item> {

		private Node current = first;

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}

		@Override
		public void remove() {

		}
	}

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-")) {
				stack.push(item);
			} else if (!stack.isEmpty()) {
				StdOut.print(stack.pop() + " ");
			}
		}
		StdOut.println("(" + stack.size() + " left on stack)");

	}
}