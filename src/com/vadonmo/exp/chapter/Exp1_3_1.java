package com.vadonmo.exp.chapter;

/**
 * 为FixedCapacityStackOfStrings添加一个isFull()
 * 
 * @author vadon
 *
 */
public class Exp1_3_1 {

	public class FixedCapacityStackOfStrings {
		private String[] a;
		private int N;

		public FixedCapacityStackOfStrings(int cap) {
			a = new String[cap];
		}

		public boolean isEmpty() {
			return N == 0;
		}

		/**
		 * 是否满
		 * 
		 * @return
		 * @return boolean
		 */
		public boolean isFull() {
			return a.length > N;
		}

		public int size() {
			return N;
		}

		public void push(String item) {
			a[N++] = item;
		}

		public String pop() {
			return a[--N];
		}
	}
}
