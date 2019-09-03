package com.ljjava.oo.chpt5;

public class BreakStatement {
	public static void main(String[] args) {
		// 打印单数
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + ":" + j);
				if (0 == j % 2) {
					break;// 如果是双数，结束当前循环
				}
			}
		}

		System.out.println("--------------------------");

		// 借助外面循环变量进行break
		boolean breakoutFlag = false; // 是否终止外部循环的标记
		for (int m = 1; m < 10; m++) {
			for (int n = 1; n < 10; n++) {
				System.out.println(m + ":" + n);
				if (0 == n % 2) {
					breakoutFlag = true;// 终止外部循环
					break;
				}
			}

			if (breakoutFlag) { // 判断是否终止外部循环
				break;
			}
		}

		System.out.println("--------------------------");

		// 在外部循环的前一行，加上标签
		// 在break的时候使用该标签
		// 即能达到结束外层循环的效果
		outloop: for (int x = 2; x < 10; x++) {
			for (int y = 1; y < 10; y++) {
				System.out.println(x + ":" + y);
				if (0 == y % 2) {
					break outloop;
				}
			}
		}
	}
}
