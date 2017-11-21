package com.vadonmo.exp.chapter;

import java.math.BigInteger;

import com.vadonmo.exp.api.StdOut;
/**
 * 计算机用这段程序在一个小时之内能够得到F(N)结果的最大N值是多少？
 * 开发F(N)的一个更好的实现，用数组保存已经计算过的值。
 * @author vadon
 *
 */
public class Exp1_1_19 {
	public static void main(String args[]) {
		for (int N = 0; N < 100; N++) {
			//StdOut.println(N + " " + F(N));
			StdOut.println(N + " " + F2(N));
		}
	}

	public static long F(int N) {
		if (N == 0) {
			return 0;
		}
		if (N == 1) {
			return 1;
		}
		return F(N - 1) + F(N - 2);
	}

	// int范围太小放不开大数据
	public static BigInteger[] array = new BigInteger[100];

	public static BigInteger F2(int N) {
		if (N == 0) {
			array[0] = BigInteger.valueOf(0);
			return BigInteger.valueOf(0);
		}
		if (N == 1) {
			array[1] = BigInteger.valueOf(1);
			return BigInteger.valueOf(1);
		}
		array[N] = array[N - 1].add(array[N - 2]);
		return array[N];
	}
}