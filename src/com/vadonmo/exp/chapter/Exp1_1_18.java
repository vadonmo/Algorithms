package com.vadonmo.exp.chapter;

import com.vadonmo.exp.api.StdOut;

/**
 * mystery(2, 25)和mystery(3, 11)返回值是多少
 * 
 * @author vadon
 *
 */
public class Exp1_1_18 {
	public static void main(String args[]) {
		StdOut.print(mystery(2, 25) + "\n");
		StdOut.print(mystery(3, 11) + "\n");
		StdOut.print(mysteryMul(2, 25) + "\n");
		StdOut.print(mysteryMul(3, 11));
	}

	public static int mystery(int a, int b) {
		if (b == 0) {
			return 0;
		}
		if (b % 2 == 0) {
			return mystery(a + a, b / 2);
		}
		return mystery(a + a, b / 2) + a;
	}

	public static int mysteryMul(int a, int b) {
		if (b == 0) {
			return 1;
		}
		if (b % 2 == 0) {
			return mystery(a * a, b / 2);
		}
		return mystery(a * a, b / 2) * a;
	}
}
