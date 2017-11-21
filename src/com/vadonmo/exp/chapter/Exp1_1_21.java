package com.vadonmo.exp.chapter;

import com.vadonmo.exp.api.StdIn;
import com.vadonmo.exp.api.StdOut;

/**
 * 编写一段程序，从标准输入按行读取数据，其中每行都包含一个名字和两个整数。
 * 然后用printf()打印一张表格，每行的若干列数据包括名字、两个整数和第一个整数除以第二个整数的结果， 精确到小数点后三位。
 * 
 * @author vadon
 *
 */
public class Exp1_1_21 {

	public static void main(String[] args) {
		System.out.printf("%-10s%-10s%-10s%-10s", "name", "numOne", "numTwo",
				"result");
		while (StdIn.hasNextLine()) {
			String name = StdIn.readString();
			int m = StdIn.readInt();
			int n = StdIn.readInt();
			StdOut.printf("%-10s%-10d%-10d%-10.3f", name, m, n, (m * 1.0) / n);
			System.out.println();
		}
//		name      numOne    numTwo    result    wwd 22 34 vadon 45 67
//		wwd       22        34        0.647     
//		vadon     45        67        0.672     
	}
}
