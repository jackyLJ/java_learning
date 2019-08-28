package com.ljjava.oo.chpt5;

import java.util.Scanner;

public class WhileStatement {
	public static void main(String[] args) {
		int i = 0; // 打印0到4
		while (i < 5) {
			System.out.println(i);
			i++;
		}

		int j = 0; // 打印0到4
		do {
			System.out.println(j);
			j++;
		} while (j < 5);

		System.out.println("请输入一个正整数");
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();

		int result = 1;
		int n = 0;
		while (n < m) {
			result *= m - n;
			n++;
		}

		System.out.println("数字" + m + "阶乘为:" + result);
		
		//更简洁的写法，赞一个
		while (m > 0) {
			m *= m--;			
		}
		System.out.println("阶乘为:" + result);
	}
}
