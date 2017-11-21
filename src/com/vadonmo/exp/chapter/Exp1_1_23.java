package com.vadonmo.exp.chapter;

import java.util.Arrays;

import com.vadonmo.exp.api.In;
import com.vadonmo.exp.api.StdIn;
import com.vadonmo.exp.api.StdOut;

/**
 * 为BinarySearch的测试用例添加一个参数：+打印出标准输入中不在白名单上的值；-打印出出标准输入中在白名单上的值。
 * 
 * @author vadon
 *
 */
public class Exp1_1_23 {
	public static boolean BinaryLookup(int key, int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + ((high - low) >> 1);
			if (key < arr[mid])
				high = mid - 1;
			else if (key > arr[mid])
				low = mid + 1;
			else
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// “ + ” --> 打印出标准输入中不在白名单上的值，
		// “ - ” --> 打印出标准输入中在白名单上的值
		char symbol = '-';
		int[] whitelist = new In(args[0]).readAllInts();
		Arrays.sort(whitelist);
		while (!StdIn.isEmpty()) {
			int key = StdIn.readInt();
			boolean found = BinaryLookup(key, whitelist);
			if ('+' == symbol && !found)
				StdOut.println(key);
			if ('-' == symbol && found)
				StdOut.println(key);
		}
	}
}
