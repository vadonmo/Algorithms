package com.vadonmo.exp.chapter;

import com.vadonmo.exp.api.StdIn;
import com.vadonmo.exp.api.StdOut;
import com.vadonmo.exp.example.Stack;

/**
 * 给定一下输入，java Stack的输出是什么 
 * it was - the best - of times - - - it was - the - -
 * 
 * @author vadon
 *
 */
public class Exp1_3_2 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-")) {
				stack.push(item);
			} else if (!stack.isEmpty()) {
				StdOut.print(stack.pop() + " ");
			}
		}
		StdOut.println("(" + stack.size() + " left on stack)");

	}
	// was best times of the was the it (1 left on stack)
}
