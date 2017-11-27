package com.vadonmo.exp.chapter;

import com.vadonmo.exp.api.StdOut;
import com.vadonmo.exp.example.Stack;

public class Exp1_3_11 {

	public static void main(String[] args) {
		String string = "23*21-/341-*+";
		StdOut.println("后序：" + string);
		StdOut.print(EvaluatePostfix(string));
	}

	private static int EvaluatePostfix(String infix) {
		Stack<Integer> numStack = new Stack<Integer>();
		String[] infixArr = infix.split("");
		for (int i = 1, len = infixArr.length; i < len; i++) {
			String temp = infixArr[i];
			if (IsOperator(temp)) {
				int num = 0;
				int n = numStack.pop();
				int m = numStack.pop();
				if (temp.equals("+")) {
					num = m + n;
				}else if (temp.equals("-")) {
					num = m - n;
				}else if (temp.equals("*")) {
					num = m * n;
				}else if (temp.equals("/")) {
					num = m / n;
				}
				numStack.push(num);
			}else {
				numStack.push(Integer.parseInt(temp));
			}
		}
		return numStack.pop();
	}
	
	private static boolean IsOperator(String str) {
		if (!(str.equals("+") || str.equals("-") || str.equals("*")
				|| str.equals("/") || str.equals("(") || str.equals(")"))) {
			return false;
		} else {
			return true;
		}
	}
}
