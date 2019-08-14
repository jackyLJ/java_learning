package com.ljjava.oo;

public class TypeConvert {
	public static void main(String[] args) {
		char c = 'A';
		short s = 80;
		System.out.println(c);
		System.out.println(s);

		char c1 = (char) s;
		System.out.println(c1);

		short s1 = (short) c;
		System.out.println(s1);
	}
}
