package com.vadonmo.exp.chapter;

import com.vadonmo.exp.example.Queue;
import com.vadonmo.exp.example.Stack;

/**
 * 下面这段代码对队列q进行了什么操作？
 * 
 * @author vadon
 *
 */
public class Exp1_3_6 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		Queue<String> q = new Queue<String>();
		while (!q.isEmpty()) {
			stack.push(q.dequeue());
		}
		while (!stack.isEmpty()) {
			q.enqueue(stack.pop());
		}
	}
	// 首尾反序
}
