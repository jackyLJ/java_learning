package com.ljjava.oo.chpt5;

/*
 * 寻找某两个数相除，其结果 离黄金分割点 0.618最近
 * 分母和分子不能同时为偶数
 * 分母和分子 取值范围在[1-20]
 */
public class Practice {
	public static void main(String[] args) {
		double goldenPoint = 0.618;
		double nearest = 0;
		int up = 0;
		int down = 0;

		for (int m = 1; m < 10; m++) {
			for (int n = m + 1; n < 20; n++) {
				System.out.println("m=" + m + ", n=" + n);
				if (0 == m % 2 && 0 == n % 2)
					continue;
				double temp = (double) m / (double) n;
				System.out.println("temp=" + temp);
				if (Math.abs(goldenPoint - temp) < Math.abs(goldenPoint - nearest)) {
					nearest = temp;
					up = m;
					down = n;
				}
			}
		}

		System.out.println("Up:" + up + ", Down:" + down + "Up/Down:" + up + "/" + down + "=" + nearest);
	}
}
