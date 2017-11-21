package com.vadonmo.exp.chapter;

import com.vadonmo.exp.api.StdIn;
import com.vadonmo.exp.api.StdOut;
import com.vadonmo.exp.example.Stack;

/**
 * 编写一个Stack用例Parenthess，从标准输入中读取一个文本流并使用栈判定其中的括号是否匹配完整。
 * 
 * @author vadon
 *
 */
public class Exp1_3_4 {

	public static void main(String[] args) {
		Parenthess();
	}

	public static void Parenthess() {
		Stack<String> stack = new Stack<String>();
		String string = StdIn.readString();
		String[] items = string.trim().split("");
		for (String item : items) {
			if (item.equals("[") || item.equals("(") || item.equals("{")) {
				stack.push(item);
			} else if (!stack.isEmpty()) {
				if (item.equals("}")) {
					if (!stack.pop().equals("{")) {
						StdOut.println(false);
						return;
					}
				} else if (item.equals("]")) {
					if (!stack.pop().equals("[")) {
						StdOut.println(false);
						return;
					}
				} else if (item.equals(")")) {
					if (!stack.pop().equals("(")) {
						StdOut.println(false);
						return;
					}
				}
			}
		}
	}
	// [()]{}{[()()]()}
	// [(])
}
