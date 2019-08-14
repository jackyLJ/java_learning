package com.ljjava.oo;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("第一个整数：" + a);

		int b = s.nextInt();
		System.out.println("第二个整数：" + b);

		int c = a + b;
		System.out.println("a + b = " + c);
	}
}
