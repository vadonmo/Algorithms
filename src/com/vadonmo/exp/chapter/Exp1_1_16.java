package com.vadonmo.exp.chapter;

import com.vadonmo.exp.api.StdOut;

/**
 * 给出exRl(6)的返回值
 * @author vadon
 *
 */
public class Exp1_1_16 {

	public static void main(String[] args) {
		StdOut.print(exRl(6));
	}
	
	public static String exRl(int n) {
		if(n <= 0){
			return "";
		}else {
			return exRl(n - 3) + n + exRl(n - 2) + n;
		}
	}

}
