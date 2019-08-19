package com.ljjava.oo;

import java.util.Scanner;

// 三元操作符
public class TenaryOperation {
	public static void main(String[] args) {
		System.out.println("请输入星期几，1~7");
		Scanner s = new Scanner(System.in);
		int day = s.nextInt();

		String text = day < 6 ? "工作日" : "周末";

		System.out.println("今天是星期" + day + "，是" + text);
	}
}
