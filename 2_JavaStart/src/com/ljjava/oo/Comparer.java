package com.ljjava.oo;

import java.util.Scanner;

public class Comparer {
	public static void main(String[] args) {
		System.out.println("请输入2个整数：");
		Scanner scanner = new Scanner(System.in);
		int firstInt = scanner.nextInt();
		
		System.out.println("第一个整数为：" + firstInt);
		int secInt = scanner.nextInt();
		System.out.println("第二个整数为：" + secInt);

		System.out.println("比较" + firstInt + ">" + secInt + "：" + (firstInt > secInt));
		System.out.println("比较" + firstInt + ">=" + secInt + "：" + (firstInt >= secInt));
		System.out.println("比较" + firstInt + "<" + secInt + "：" + (firstInt <= secInt));
		System.out.println("比较" + firstInt + "<=" + secInt + "：" + (firstInt <= secInt));
		System.out.println("比较" + firstInt + "<=" + secInt + "：" + (firstInt <= secInt));
		System.out.println("比较" + firstInt + "==" + secInt + "：" + (firstInt == secInt));
		System.out.println("比较" + firstInt + "!=" + secInt + "：" + (firstInt != secInt));
	}
}
