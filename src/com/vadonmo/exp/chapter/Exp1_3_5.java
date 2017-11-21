package com.vadonmo.exp.chapter;

import com.vadonmo.exp.api.StdOut;
import com.vadonmo.exp.example.Stack;

/**
 * 当N为50时下面这段代码会打印什么？从较高的抽象层次描述给定正整数N时这段代码的行为
 * 
 * @author vadon
 *
 */
public class Exp1_3_5 {

	public static void main(String[] args) {
		int N = 50;
		Stack<Integer> stack = new Stack<Integer>();
		while (N > 0) {
			stack.push(N % 2);
			N /= 2;
		}
		for (int d : stack)
			StdOut.print(d);
		StdOut.println();
	}
	// 110010 N的二进制
}
