package com.vadonmo.exp.chapter;

import java.util.Arrays;

import com.vadonmo.exp.api.StdOut;

/****
 * 编写一个静态方法histogram()，接受一个整型数组a[]和一个整数M为参数并返回一个大小为M的数组，
 * 其中第i个元素的值为整数i在参数数组中出现的次数。 如果a[]中的值均在0到M-1之间，返回数组中的所有元素之和应该和a.length相等。
 * 
 * @author vadon
 *
 */
public class Exp1_1_15 {

	public static void main(String args[]) {
		int[] a = {1,2,2,5,4,7,7,0,0,5};
		StdOut.print(Arrays.toString(histogram(a, 10)));
		//[2, 1, 2, 0, 1, 2, 0, 2, 0, 0]
	}
	
	public static int[] histogram(int[] a, int M){
		int[] array = new int[M];
		for (int i = 0, len = a.length; i < len; i++) {
			int num = 0;
			for (int j = 0; j < len; j++) {
				if (a[j] == a[i]) {
					num ++;
				}
			}
			array[a[i]] = num;
		}
		return array;
	}
}
