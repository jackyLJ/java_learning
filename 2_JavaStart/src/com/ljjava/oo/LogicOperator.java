package com.ljjava.oo;

public class LogicOperator {
	public static void main(String[] args) {
		int i = 2;
		System.out.println(i == 1 & i++ == 2); // 长路与，无论第一个表达式的值是true或false，第二个表达式都会被运算。所以无论如何i++都会被执行，i的值变成了3
		System.out.println("i = " + i);

		int j = 2;
		System.out.println(j == 1 && j++ == 2); // 短路与，只要第一个表达式的值为false,第二个表达式的值就不会运算。因为j==1返回false，所以右边的j++就没有执行了，j的值还是2
		System.out.println("j = " + j);

		int m = 2;
		System.out.println(m == 1 | m++ == 2); // 长路或，无论第一个表达式的值是true或false，第二个表达式都会被运算。所以无论如何m++都会被执行，m的值变成了3
		System.out.println("m = " + m);

		int n = 2;
		System.out.println(n == 2 || n++ == 2); // 短路或，只要第一个表达式的值为true,第二个表达式的值就不会运算。因为n==2返回true，所以右边的n++就没有执行了，n的值还是2
		System.out.println("n = " + n);

		boolean k = true;
		System.out.println("k=" + k);
		System.out.println("k取反" + !k);

		// 异或
		// 不同，返回真
		// 相同，返回假
		boolean a = true;
		boolean b = false;
		System.out.println("a^b：" + (a ^ b));
		System.out.println("a^!b：" + (a ^ !b));
		System.out.println("!a^b：" + (!a ^ b));
		System.out.println("!a^!b：" + (!a ^ !b));
		
		// 练习
		int y = 1;
		boolean z = !(y++ == 3) ^ (y++ ==2) && (y++==3);
		System.out.println(z); // false
		System.out.println(y); // 3
	}
}
