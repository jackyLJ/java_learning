package com.ljjava.oo;

public class BitOperator {
	public static void main(String[] args) {
		int i = 5;
		String b = Integer.toBinaryString(i); // 获取整数的二进制表达
		System.out.println(i + " binary:" + b);

		int j = 6;
		String c = Integer.toBinaryString(j);
		System.out.println(j + " binary:" + c);

		// 位或
		int k = i | j;
		String d = Integer.toBinaryString(k);
		System.out.println(i + "|" + j + "=" + k + ", binary:" + d);

		// 位与
		int m = i & j;
		String e = Integer.toBinaryString(m);
		System.out.println(i + "&" + j + "=" + e + ", binary:" + e);

		// 异或
		int n = i ^ j;
		String f = Integer.toBinaryString(n);
		System.out.println(i + "^" + j + "=" + n + ", binary:" + f);

		int n1 = i ^ i;// 任何数和自己异或，都等于0
		int n2 = i ^ 0;// 任何数和0进行异或，都等于自己
		String f1 = Integer.toBinaryString(n1);
		String f2 = Integer.toBinaryString(n2);
		System.out.println(i + "^" + i + "=" + n1 + ", binary:" + f1);
		System.out.println(i + "^0" + "=" + n2 + ", binary:" + f2);

		// 取非
		int p = ~i;
		String g = Integer.toBinaryString(p);
		System.out.println("~" + i + "=" + p + ", binary:" + g);

		// 左移、右移
		byte r = 6;
		String h = Integer.toBinaryString(r);
		int r1 = r << 1;
		int r2 = r >> 1;
		System.out.println(r + " binary:" + h);
		System.out.println(r + "左移一位：" + r1 + ", binary:" + Integer.toBinaryString(r1));
		System.out.println(r + "右移一位：" + r2 + ", binary:" + Integer.toBinaryString(r2));

		byte s = 2;
		int s1 = 2 << 4;
		System.out.println(s + "x 16 =" + s1 + ", binary:" + Integer.toBinaryString(s1));

		// 带符号右移
		int t = -10;
		System.out.println(t + ", binary:" + Integer.toBinaryString(t));

		// 对于正数，带符号右移 >> 会把所有的位右移，并在最前面补0
		// 对于负数，带符号右移 >> 会把所有的位右移，并在最前面补1

		// -10带符号右移1位，移动后前面补齐1
		int t1 = t >> 1;
		System.out.println(t + "带符号右移1位：" + t1 + ", \t\tbinary:" + Integer.toBinaryString(t1));

		// -10无符号向右移1位，符号位也会向右移，第1位就变成了0
		int t2 = t >>> 1;
		System.out.println(t + "无符号右移1位：" + t2 + ", \tbinary:" + Integer.toBinaryString(t2));

		int q1 = 3;
		int q2 = 2;
		int q3 = ((q1 | q2) ^ (q1 & q2)) << 2 >>> 1;
		System.out.println("q3= " + q3 + ", binary:" + Integer.toBinaryString(q3));
	}
}
