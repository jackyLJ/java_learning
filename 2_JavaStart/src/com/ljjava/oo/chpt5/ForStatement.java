package com.ljjava.oo.chpt5;

public class ForStatement {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("for循环输出的" + i);
		}

		/*
		 * 天朝有一个乞丐姓洪，去天桥要钱 第一天要了1块钱 第二天要了2块钱 第三天要了4块钱 第四天要了8块钱
		 * 
		 * 以此类推
		 * 
		 * 问题： 洪乞丐干10天，收入是多少？
		 */
		// 第一种方法：通过移位的方法
		int money = 0;
		int dayMoney = 0;
		for (int j = 1; j <= 10; j++) {
			dayMoney = 1 << (j - 1);
			money += dayMoney;
			System.out.println("第" + j + "天要了" + dayMoney);
		}

		System.out.println("10天一共要了多少钱？" + money);
		System.out.println("----------------------------");

		// 第二种方法：天数和每天要的钱分别计算，比较巧妙
		int money2 = 0;
		int dayMoney2 = 0;
		int j2 = 1;
		for (int i2 = 1; j2 <= 10;) {
			dayMoney2 = i2;
			System.out.println("第" + j2 + "天要了" + dayMoney2);

			money2 += dayMoney2;
			j2++;
			i2 = i2 * 2;
		}
		System.out.println("10天一共要了多少钱？" + money2);
	}
}
