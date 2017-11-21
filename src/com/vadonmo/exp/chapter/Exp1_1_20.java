package com.vadonmo.exp.chapter;

import com.vadonmo.exp.api.StdOut;

/**
 * 编写一个递归的静态方法计算In(N!)的值
 * @author vadon
 *
 */
public class Exp1_1_20 {

	public static void main(String[] args) {
		StdOut.print(Math.log10(factorial(10)));
	}
	
	/**
	 * 计算阶乘
	 * @param N
	 * @return
	 * @return double
	 */
	public static double factorial(int N) {
		if (N == 0) {
			return 0;
		}
		if (N == 1) {
			return 1;
		}
		return N * factorial(N - 1);
	}
}
