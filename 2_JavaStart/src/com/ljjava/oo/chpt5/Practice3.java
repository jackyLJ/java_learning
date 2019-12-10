package com.ljjava.oo.chpt5;

/*
 * 练习-小学算术题
 * Refer to http://how2j.cn/k/control-flow/control-flow-practise/656.html 
 */
public class Practice3 {
	public static void main(String[] args) {
		for (int a = 0; a <= 8; a++) {
			for (int b = 0; b <= 8; b++) {
				for (int c = 0; c <= 14; c++) {
					for (int d = 0; d <= 10; d++) {
						if (a + b == 8 && a + c == 14 && b + d == 10 && c - d == 6) {
							System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", d=" + d);
//							break;
						}
					}
				}
			}
		}
	}
}
