package com.vadonmo.exp.chapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vadonmo.exp.api.StdOut;
import com.vadonmo.exp.example.Stack;

/**
 * 编写一个过滤器InfixToPostfix,将算术表达式由中序转为后续表达式
 * 
 * @author vadon
 *
 */
public class Exp1_3_10 {

	public static void main(String[] agrs) {
		String string = "2*3/(2-1)+3*(4-1)";
		StdOut.println("中序：" + string);
		StdOut.println("后序：" + InfixToPostfix(string));
	}

	public static String InfixToPostfix(String infix) {
		Stack<String> opStack = new Stack<String>();
		String result = "";
		String[] infixArr = infix.split("");
		for (int i = 1; i < infixArr.length; i++) {
			String temp = infixArr[i];
			if (!IsOperator(temp)) {// 数字入栈
				result += temp;
			} else if (temp.equals("(")) {// 左括号入栈
				opStack.push(temp);//
			} else if (temp.equals(")")) {// 右括号循环出栈直到左括号
				while (!opStack.isEmpty() && !opStack.peek().equals("(")) {
					result += opStack.pop();
				}
				if (opStack.peek().equals("(")) {
					opStack.pop();// 左括号出栈
				}
			} else {
				if (opStack.isEmpty()) {
					opStack.push(temp);
				} else if (change(temp) <= change(opStack.peek())) {// 优先级大于栈顶
					result += opStack.pop();
					opStack.push(temp);
				} else {
					opStack.push(temp);
				}
			}
		}
		while (!opStack.isEmpty()) {
			result += opStack.pop();
		}
		return result;
	}

	private static boolean IsOperator(String str) {
		if (!(str.equals("+") || str.equals("-") || str.equals("*")
				|| str.equals("/") || str.equals("(") || str.equals(")"))) {
			return false;
		} else {
			return true;
		}
	}

	private static int change(String op) {
		switch (op) {
		case "+":
			return 1;
		case "-":
			return 1;
		case "*":
			return 2;
		case "/":
			return 2;
		default:
			return 0;
		}
	}
}
