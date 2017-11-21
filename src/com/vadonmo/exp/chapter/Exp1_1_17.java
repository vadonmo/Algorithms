package com.vadonmo.exp.chapter;

/**
 * 找出下列递归函数的问题
 * @author vadon
 *
 */
public class Exp1_1_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(exR2(6));
		//无限递归没有出口
	}

	public static String exR2(int n) {
		String s = exR2(n - 3) + n + exR2(n - 2) + n;
		if (n <= 0) {
			return "";
		}else {
			return s;
		}
	}
}
