package com.vadonmo.exp.example;

import java.util.Stack;

import com.vadonmo.exp.api.StdIn;
import com.vadonmo.exp.api.StdOut;

/**
 * Dijkstra双栈算术表达式求值算法
 * @author vadon
 *
 */
public class Evalua {

	public static void main(String[] args) {
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		while (!StdIn.isEmpty()) {
			String s = StdIn.readString();
			if (s.equals("(")) {
				
			}else if (s.equals("+")) {
				ops.push(s);
			}else if (s.equals("-")) {
				ops.push(s);
			}else if (s.equals("*")) {
				ops.push(s);
			}else if (s.equals("/")) {
				ops.push(s);
			}else if (s.equals("sqrt")) {
				ops.push(s);
			}else if (s.equals(")")) {
				String op = ops.pop();
				double v = vals.pop();
				if (op.equals("+")) {
					v = vals.pop() + v;
				}else if (op.equals("-")) {
					v = vals.pop() - v;
				}else if (op.equals("*")) {
					v = vals.pop() * v;
				}else if (op.equals("/")) {
					v = vals.pop() / v;
				}else if (op.equals("sqrt")) {
					v = Math.sqrt(v);
				}
				vals.push(v);
			}else {
				vals.push(Double.parseDouble(s));
			}
		}
		StdOut.println(vals.pop());
	}

}
