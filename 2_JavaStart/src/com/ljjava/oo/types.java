package com.ljjava.oo;

public class types {
	public static void main(String[] args) {
		long val = 26L; // 定义long类型
		int decVal = 26; // 默认为int类型
		int hexVal = 0x1a; // 16进制
		int oxVal = 032; // 8进制
		int binaryVal = 0b11010; // 2进制

		System.out.println("long:" + val);
		System.out.println("decimal int:" + decVal);
		System.out.println("hex int:" + hexVal);
		System.out.println("ox int:" + oxVal);
		System.out.println("binary int:" + binaryVal);

		float f1 = 123.4F; // float类型
		double d1 = 123.4; // 默认为double类型
		double d2 = 1.234e2; // 科学计数法表示double

		// byte b = 130;

		System.out.println("float:" + f1);
		System.out.println("dobule:" + d1);
		System.out.println("double e:" + d2);

		char c = 'c';
		String name = "牛牛";

		System.out.println(c);
		System.out.println(name);

		// 转义字符
		char tab = '\t'; // 制表符
		char carriageReturn = '\r'; // 回车
		char newLine = '\n'; // 换行符
		char doubleQuote = '\"'; // 双引号
		char singleQuote = '\''; // 单引号
		char backSlash = '\\'; // 反斜杠

		System.out.println("制表符[" + tab + "]");
		System.out.println("回车符[" + carriageReturn + "]");
		System.out.println("换行符[" + newLine + "]");
		System.out.println("双引号[" + doubleQuote + "]");
		System.out.println("单引号[" + singleQuote + "]");
		System.out.println("反斜杠[" + backSlash + "]");
	}
}
