package com.vadonmo.exp.chapter;

import com.vadonmo.exp.api.StdOut;

/**
 * 二项分布。估计用以下代码计算binomial(100, 50, 0.25) 将会产生的递归调用次数：
 * public static double binomial(int N,int k, double p) {
        if(N == 0 && k == 0)
            return 1.0;
        if(N < 0 || k < 0)
            return 0.0;
        return (1.0 - p) * binomial(N-1, k, p) + p * binomial(N-1, k-1, p);
    }
 * 将已经计算过的值保存在数组中并给出一个更好的实现。
 * @author vadon
 *
 */
public class Exp1_1_27 {

	public static double[][] Arr = new double[100 + 1][50 + 1];

	public static void main(String[] args) {
		for (int i = 0; i < 101; ++i)
			for (int j = 0; j < 50 + 1; ++j)
				Arr[i][j] = -1.0;
		StdOut.print(binomial(100, 50, 0.25));
		//4.507310875086383E-8
	}

	public static double binomial(int N, int k, double p) {
		if (N < 0 || k < 0) {
			return 0.0;
		} else if (N == 0 && k == 0 && Arr[N][k] == -1.0) {
			Arr[N][k] = 1.0;
			return 1.0;
		} else if (Arr[N][k] == -1.0) {

			Arr[N][k] = (1.0 - p) * binomial(N - 1, k, p) + p
					* binomial(N - 1, k - 1, p);
		}
		return Arr[N][k];
	}
}
