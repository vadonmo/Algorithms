package com.vadonmo.exp.chapter;

/**
 * 使用1.1.6.4节中的rank()递归方法重新实现BinarySearch并跟踪该方法的调用。每当该方法被调用时，
 * 打印出它的参数lo和hi并安照递归深度缩进。
 * 
 * @author vadon
 *
 */
public class Exp1_1_22 {

	public static void main(String[] args) {
		int[] array = { 1, 3, 5, 7, 9 };
		rank(3, array, 0);
	}

	public static int rank(int key, int[] a, int deep) {
		return rank(key, a, 0, a.length - 1, deep);
	}

	private static int rank(int key, int[] a, int lo, int hi, int deep) {
		for (int i = 0; i < deep; ++i)
			System.out.print(" ");
		System.out.println("lo: " + lo + " hi: " + hi);
		deep++;
		if (lo > hi) {
			return -1;
		}
		int mid = lo + (hi - lo) / 2;
		if (key < a[mid]) {
			return rank(key, a, lo, mid - 1, deep);
		} else if (key > a[mid]) {
			return rank(key, a, mid + 1, hi, deep);
		} else {
			return mid;
		}
	}
//	lo: 0 hi: 4
//	 lo: 0 hi: 1
//	  lo: 1 hi: 1

}
