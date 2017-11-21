package com.vadonmo.exp.chapter;

import com.vadonmo.exp.api.StdOut;

/**
 * 给出使用欧几里德算法计算105 和24 的最大公约数的过程中得到的一系列p 和q的值。
 * 扩展该算法中的代码得到一个程序Euclid，从命令行接受两个参数，计算它们的最大公约数并打印出每次调用递归方法时的两个参数。
 * 使用你的程序计算1 111 111 和1 234 567 的最大公约数。
 * 
 * @author vadon
 *
 */
public class Exp1_1_24 {

	public static void main(String[] args) {
		StdOut.print(Euclid(105, 24) + "\n");
		StdOut.print(Euclid(1111111, 1234567));
//		p=105,q=24
//		p=24,q=9
//		p=9,q=6
//		p=6,q=3
//		p=3,q=0
//		3
//		p=1111111,q=1234567
//		p=1234567,q=1111111
//		p=1111111,q=123456
//		p=123456,q=7
//		p=7,q=4
//		p=4,q=3
//		p=3,q=1
//		p=1,q=0
//		1
	}

	public static long Euclid(int p, int q) {
		StdOut.printf("p=%d,q=%d\n", p, q);
		if (q == 0)
			return p;
		int r = p % q;
		return Euclid(q, r);
	}
}
