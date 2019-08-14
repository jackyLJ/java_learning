package com.ljjava.oo;

public class Operator {
	public static void main(String[] args) {
		int a = 5;
		long b = 6;
		int c = (int) (a + b); // 如果有任何运算单元的长度超过int，那么运算结果就按照最长的长度计算
		long d = a + b;

		byte b1 = 1;
		byte b2 = 2;
		byte s = (byte) (b1 + b2); // 如果任何运算单元的长度都不超过int，那么运算结果就按照int来计算。所以
									// 虽然a和b都是byte类型 但是运算结果是int类型，需要强制类型转换
		int s1 = b1 + b2;
		
		int i1 = 5;
		int j1 = 2;
		System.out.println(i1%j1);
		
		int i = 1;
		int j = ++i + i++ + ++i + ++i + i++;
		
		System.out.println(j);
	}
}
