package com.vadonmo.exp.example;

import java.util.Iterator;

/**
 * 下压（LIFO）栈，能够动态调整数组大小的实现
 * 
 * @author vadon
 *
 * @param <Item>
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {
	// 栈元素
	private Item[] a = (Item[]) new Object[1];
	// 栈元素数量
	private int N = 0;

	// 是否为空
	public boolean isEmpty() {
		return N == 0;
	}

	// 大小
	public int size() {
		return N;
	}

	// 动态调整大小
	public void resize(int max) {
		// 将原来的元素全部移到新数组
		Item[] temp = (Item[]) new Object[max];
		for (int i = 0, len = temp.length; i < len; i++) {
			temp[i] = a[i];
		}
		a = temp;
	}

	// 增加元素
	public void push(Item item) {
		if (N == a.length) {
			resize(2 * a.length);
		}
		a[N++] = item;
	}

	// 删除元素
	public Item pop() {
		Item item = a[--N];
		a[N] = null;
		if (N > 0 && N == a.length / 4) {
			resize(a.length / 2);
		}
		return item;
	}

	@Override
	public Iterator<Item> iterator() {
		return new ReverseArrayIterator();
	}

	private class ReverseArrayIterator implements Iterator<Item> {
		private int i = N;

		@Override
		public boolean hasNext() {
			return i > 0;
		}

		@Override
		public Item next() {
			return a[--i];
		}

		@Override
		public void remove() {

		}

	}

}
