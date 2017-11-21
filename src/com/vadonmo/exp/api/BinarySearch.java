package com.vadonmo.exp.api;
import java.io.IOException;


/**
 * 二分查找
 * @author wwd
 *
 */
public class BinarySearch {

	public static void main(String[] args) throws IOException{
		//File directory = new File("");//参数为空
		//String courseFile = directory.getCanonicalPath() ;
		//System.out.println(courseFile); 
		// int[] whitelist = In.readInts("a.txt");
		// Arrays.sort(whitelist);
		// System.out.println(rank(1, whitelist));
		// System.out.println(rank2(1, whitelist, 0, whitelist.length - 1));
		System.out.println((1 + 2.236) / 2);
		//float a = 2.0e-15;
		System.out.println(4.1 >= 4);
		System.out.println(1 + 2 + "3");
	}
	
	public static int rank(int key, int a[]) {
		int start = 0;
		int end = a.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (key < a[mid])  end = mid - 1;
			else if (key > a[mid]) start = mid + 1;
			else return mid;
		}
		return -1;
	}
	
	public static int rank2(int key, int a[], int start, int end){
		int mid = (end - start) / 2 + start;
		if (start > end) return -1;
		if (key < a[mid]) return rank2(key, a, start, mid - 1);
		else if (key > a[mid]) return rank2(key, a, mid, end + 1);
		else return mid;
	}
	
	
	
}
