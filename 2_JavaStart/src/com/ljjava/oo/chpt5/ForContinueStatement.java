package com.ljjava.oo.chpt5;

public class ForContinueStatement {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				continue; // 如果是偶数，就不执行后续代码，直接进行下一次循环
			System.out.println(i);
		}

		System.out.println("---------------------------------");

		// 打印1~100之间的数，如果这个数，是3或5的倍数，则忽略
		for (int j = 1; j <= 100; j++) {
			if (j % 3 == 0 || j % 5 == 0)
				continue;
			System.out.println(j);
		}

		// Practice:
		/*
		 * 假设你月收入是3000，除开平时花销，每个月留下1000块钱进行投资。
		 * 
		 * 然后你认真的钻研了 《股票和基金 21天从入门到精通》，达到了每年20%的投资回报率。
		 * 
		 * 那么问题来了，以每个月投资1000块钱的节奏，持续投资多少年，总收入达到100万 （复利计算按照每年12000投入计算，不按照每月计息）
		 * 
		 * 复利公式： F = p* ( (1+r)^n ); F 最终收入 p 本金 r 年利率 n 存了多少年
		 * 
		 * 假设情景一： p = 10000 r = 0.05 n = 1
		 * 
		 * 解读： 本金是10000 年利率是5% 存了一年 1次 复利收入 10000*( (1+0.05)^1 ) = 10500
		 * 
		 * 假设情景二： p = 10000 r = 0.05 n = 2
		 * 
		 * 解读： 本金是10000 年利率是5% 存了两年 复利收入 10000*( (1+0.05)^2 ) = 11025
		 */
		double income = 0;
		int yearInput = 12000; // 每年还会存入12000
		double rate = 1;
		int y = 1;
		for (; income < 1000000; y++) {
			rate *= (1 + 0.2);
			if (y == 1) {
				income = yearInput * rate;
			} else {
				income = income * rate + yearInput * (1 + 0.2);
			}
			System.out.println("第" + y + "年，总收入为：" + income);
		}

		System.out.println("投资总收入达到100万需要：" + y + "年");

		System.out.println("---------------------------------");

		int y2 = 2;
		double s1 = 1.2;
		int sum = (int) (12000 * 1.20);
		while (true) {
			s1 *= (1 + 0.2);
			double p = 12000 * s1;
			sum += p;
			if (sum >= 1000000) {
				break;
			}
			y2++;
		}
		System.out.println("总收入达到100万,需" + y2 + "年");
	}
}
