package com.ljjava.oo.chpt5;

public class IfStatement {
	public static void main(String[] args) {
		boolean b = true;
		if (b) {
			System.out.println("yes");
		}

		boolean f = false;
		if (f) {
			System.out.println("yes1");
			System.out.println("yes2");
			System.out.println("yes3");
		}
		if (f)
			System.out.println("yes4");
		System.out.println("yes5");
		System.out.println("yes6");

		boolean f1 = false;
		if (f1)
			;
		System.out.println("yes7");

		boolean b1 = true;
		if (b1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		int n = 2;
		// 如果使用if，会执行4判断
		if (n == 1)
			System.out.println(1);
		if (n == 2)
			System.out.println(2);
		if (n == 3)
			System.out.println(3);
		if (n == 4)
			System.out.println(4);

		if (n == 1)
			System.out.println(1);
		else if (n == 2)
			System.out.println(2);
		else if (n == 3)
			System.out.println(3);
		else if (n == 4)
			System.out.println(4);
	}
}
