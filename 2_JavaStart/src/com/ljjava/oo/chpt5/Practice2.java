package com.ljjava.oo.chpt5;

/*
 * 水仙花数定义：
 * 1. 一定是3位数
 * 2. 每一位的立方，加起来恰好是这个数本身，比如153=1*1*1+5*5*5+3*3*3
 * 
 * 寻找所有的水仙花数
 */
public class Practice2 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					int sum = k + 10 * j + i * 100;
					int target = i * i * i + j * j * j + k * k * k;
					if (sum > 100 && sum == target) {
						System.out.println(sum);
					}
				}
			}
		}

		System.out.println("-------------------");

		// 另外一种解法
		for (int i2 = 100; i2 <= 999; i2++) {
			int x = i2 / 100;
			int y = i2 / 10 % 10;
			int z = i2 % 10;
			if (x * x * x + y * y * y + z * z * z == i2)
				System.out.println(i2);
		}
	}
}
