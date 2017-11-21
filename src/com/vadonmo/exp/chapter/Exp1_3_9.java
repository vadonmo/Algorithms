package com.vadonmo.exp.chapter;

import com.vadonmo.exp.api.StdIn;
import com.vadonmo.exp.api.StdOut;
import com.vadonmo.exp.example.Stack;

/**
 * 编写一段程序，从标准输入得到一个缺少左括号的表达式并打印出补全括号以后的中序表达式 。 
 * 例如：1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) ) 
 * 你得程序应该输出 ( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )
 * 
 * @author vadon
 *
 */
public class Exp1_3_9 {

	public static void main(String[] args) {
		StdOut.print(completeParentese());
		// 1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )
		// ( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )
	}

	/**
	 * 思路为双栈法，不需要计算结果，只需要拼装字符串即可。
	 * 
	 * @return
	 * @return String
	 */
	public static String completeParentese() {
		Stack<String> numStack = new Stack<String>();
		Stack<String> opStack = new Stack<String>();
		while (!StdIn.isEmpty()) {
			char c = StdIn.readChar();
			if (c == '+' || c == '-' || c == '*' || c == '/') {// 操作符
				opStack.push(String.valueOf(c));
			} else if (c >= '0' && c <= '9') {// 数字
				numStack.push(String.valueOf(c));
			} else if (c == ')') {// 右括号
				String num1 = "", num2 = "", op = "";
				if (!numStack.isEmpty()) {
					num1 = numStack.pop();// 数字出栈
				}
				if (!opStack.isEmpty()) {
					op = opStack.pop();// 操作符出栈
				}
				if (!numStack.isEmpty()) {
					num2 = numStack.pop();// 数字出栈
				}
				num1 = "( " + num2 + " " + op + " " + num1 + " " + c;// 补全左括号入栈
				numStack.push(num1.replace("  ", ""));//去除多余空格
			}
		}
		String result = "";
		while (numStack.size() > 0) {
			result = numStack.pop() + result;
		}
		return result;
	}
}
